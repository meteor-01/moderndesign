package com.meteor.design;

/*
 * author: meteor_01
 * date: 2023/12/13
 * desc: 懒加载，获取时实例化，节约空间，但是线程不安全
 **/
public class SingletonLazyUnsafe {
    private SingletonLazyUnsafe() {

    }

    private static SingletonLazyUnsafe instance;

    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
