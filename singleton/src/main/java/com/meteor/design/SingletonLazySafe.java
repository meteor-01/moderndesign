package com.meteor.design;

/*
 * author: meteor_01
 * date: 2023/12/13
 * desc: 懒加载，线程安全，效率低
 **/
public class SingletonLazySafe {
    private SingletonLazySafe() {

    }

    private static SingletonLazySafe instance;

    public synchronized static SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}
