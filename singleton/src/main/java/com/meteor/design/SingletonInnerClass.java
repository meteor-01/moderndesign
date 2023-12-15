package com.meteor.design;

/*
 * author: meteor_01
 * date: 2023/12/13
 * desc: 静态内部类，懒加载、线程安全
 **/
public class SingletonInnerClass {
    private SingletonInnerClass() {

    }

    public static InnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    public static class InnerClass {
        private final static InnerClass INSTANCE = new InnerClass();
    }
}
