package com.meteor.design.dynamic_proxy.jdk;

import java.lang.reflect.Proxy;

/*
 * author: meteor_01
 * date: 2023/11/1
 * desc: JDK代理工厂，根据输入的对象提供其代理类
 **/
public class JDKProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target));
    }
}