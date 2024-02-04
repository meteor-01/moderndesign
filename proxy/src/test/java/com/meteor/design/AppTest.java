package com.meteor.design;

import com.meteor.design.dynamic_proxy.cglib.CGLIBProxyFactory;
import com.meteor.design.dynamic_proxy.jdk.JDKProxyFactory;
import com.meteor.design.service.IUserService;
import com.meteor.design.service.UserService;
import com.meteor.design.static_proxy.StaticProxy;
import org.junit.Test;

/*
 * author: meteor_01
 * date: 2023/10/31
 * desc: 测试
 **/
public class AppTest {
    /*
     * author: meteor_01
     * date: 2023/10/31
     * desc: 测试静态代理
     **/
    @Test
    public void testStaticProxy() {
        StaticProxy userServiceProxy = new StaticProxy(new UserService());
        userServiceProxy.queryUserInfo();
    }

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 测试JDK动态代理
     **/
    @Test
    public void testJDKProxy() {
        IUserService proxy = (IUserService) JDKProxyFactory.getProxy(new UserService());
        proxy.queryUserInfo();
    }

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 测试cglib动态代理
     **/
    @Test
    public void testCGLIBProxy() {
        UserService proxy = (UserService) CGLIBProxyFactory.getProxy(UserService.class);
        proxy.queryUserInfo();
    }

}
