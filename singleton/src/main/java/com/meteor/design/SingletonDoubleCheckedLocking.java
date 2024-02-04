package com.meteor.design;

/*
 * author: meteor_01
 * date: 2023/12/13
 * desc: 双重校验锁，安全，但实现复杂，效率低，需要配合volatile使用
 **/
public class SingletonDoubleCheckedLocking {
    private SingletonDoubleCheckedLocking() {

    }

    private static volatile SingletonDoubleCheckedLocking instance;

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    // TODO 用于后续进行测试
    public void doSomething(int i) {
        System.out.println("SingletonDoubleCheckedLocking" + i);
    }
}
