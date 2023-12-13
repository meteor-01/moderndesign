package com.meteor.design.static_proxy;

import com.meteor.design.service.IUserService;

/*
 * author: meteor_01
 * date: 2023/10/31
 * desc: 用户服务代理类
 **/
public class StaticProxy implements IUserService {
    private IUserService userService;

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 通过组合的方式将目标类添加到代理类中
     **/
    public StaticProxy(IUserService userService) {
        this.userService = userService;
    }

    /*
     * author: meteor_01
     * date: 2023/11/1
     * desc: 重写方法，在执行目标类方法前后添加自定义操作
     **/
    @Override
    public String queryUserInfo() {
        before();
        userService.queryUserInfo();
        after();
        return null;
    }

    /*
     * author: meteor_01
     * date: 2023/10/31
     * desc: 执行用户操作之前需要执行的操作
     **/
    private void before() {
        System.out.println("执行方法前的操作");
    }

    /*
     * author: meteor_01
     * date: 2023/10/31
     * desc: 执行用户操作之后需要执行的操作
     **/
    private void after() {
        System.out.println("执行方法后的操作");
    }
}
