package com.meteor.nodesign.impl;

import com.meteor.nodesign.Animal;

/*
* @author meteor_01
* @date 2023/8/22
* @description 猫，会吃饭和睡觉，但不会狩猎
**/
public class Cat implements Animal {
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void hunt() {

    }
}
