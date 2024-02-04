package com.meteor.design.impl;

import com.meteor.design.Animal;
import com.meteor.design.Hunting;

/*
* @author meteor_01
* @date 2023/8/22
* @description 老虎会狩猎和睡觉
**/
public class Tiger implements Hunting, Animal {
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void hunt() {
        System.out.println("狩猎");
    }
}
