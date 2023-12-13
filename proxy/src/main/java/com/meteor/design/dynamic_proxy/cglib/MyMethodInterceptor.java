package com.meteor.design.dynamic_proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
 * author: meteor_01
 * date: 2023/11/1
 * desc: 方法拦截器
 **/
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object = methodProxy.invokeSuper(o, objects);
        after();
        return object;
    }

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 执行用户操作之前需要执行的操作
     **/
    private void before() {
        System.out.println("执行方法前的操作");
    }

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 执行用户操作之后需要执行的操作
     **/
    private void after() {
        System.out.println("执行方法后的操作");
    }
}
