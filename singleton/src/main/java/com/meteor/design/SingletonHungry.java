package com.meteor.design;

/*
 * author: meteor_01
 * date: 2023/12/13
 * desc: 饿汉式，类加载时实例化，线程安全，但可以通过反射破坏，缺点是浪费空间
 **/
public class SingletonHungry {
    private SingletonHungry() {

    }

    private final static SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return instance;
    }
}
