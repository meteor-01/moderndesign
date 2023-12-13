package com.meteor.design.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * author: meteor_01
 * date: 2023/11/1
 * desc: 代理类，对目标类进行功能增强，即在执行目标类方法的前后添加额外的方法，需要实现InvocationHandler接口
 **/
public class MyInvocationHandler implements InvocationHandler {
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object res = method.invoke(target, args);
        after();
        return res;
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