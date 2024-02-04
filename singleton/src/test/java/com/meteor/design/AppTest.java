package com.meteor.design;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * author: meteor_01
 * date: 2023/12/15
 * desc: 测试五种单例模式的实现
 **/
public class AppTest {
    /*
     * author: meteor_01
     * date: 2023/12/15
     * desc: 测试饿汉式，并尝试用反射破坏单例
     **/
    @Test
    public void testSingletonHungry() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonHungry instance = SingletonHungry.getInstance();

        Constructor<SingletonHungry> constructor = SingletonHungry.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingletonHungry singletonHungry = constructor.newInstance();

        System.out.println(instance);
        System.out.println(singletonHungry);
    }

    /*
     * author: meteor_01
     * date: 2023/12/15
     * desc: 测试懒加载线程不安全实现，并尝试多线程破坏单例
     **/
    @Test
    public void testSingletonLazyUnsafe() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(SingletonLazyUnsafe.getInstance());
            }).start();
        }
    }

    /*
     * author: meteor_01
     * date: 2023/12/15
     * desc: 测试双重校验锁在不加volatile时的问题
     **/
    @Test
    public void testSingletonDoubleCheckedLocking() {
        for (int i = 0; i < 20; i++) {
            int j = i;
            new Thread(() -> {
                SingletonDoubleCheckedLocking instance = SingletonDoubleCheckedLocking.getInstance();
                instance.doSomething(j);
            }).start();
        }
    }

}
