package com.meteor.nodesign.impl;

import com.meteor.nodesign.Animal;

/*
* @author meteor_01
* @date 2023/8/22
* @description 老虎，会狩猎和睡觉，但不会吃饭
**/
public class Tiger implements Animal {
    @Override
    public void eat() {

    }

    @Override
    public void hunt() {
        System.out.println("狩猎");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

}
