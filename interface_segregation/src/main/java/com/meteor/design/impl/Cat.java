package com.meteor.design.impl;

import com.meteor.design.Animal;
import com.meteor.design.Dining;

/*
* @author meteor_01
* @date 2023/8/22
* @description 猫，会吃饭和睡觉
**/
public class Cat implements Dining, Animal {
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
