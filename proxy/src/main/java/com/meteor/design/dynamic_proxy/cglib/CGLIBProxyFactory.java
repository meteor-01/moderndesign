package com.meteor.design.dynamic_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/*
 * author: meteor_01
 * date: 2023/11/1
 * desc: cglib代理工厂
 **/
public class CGLIBProxyFactory {
    public static Object getProxy(Class<?> clazz) {
        // 创建Enhancer增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置回调方法
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }
}
