package com.meteor.design.impl;

import com.meteor.design.Car;

/*
* @author meteor_01
* @date 2023/8/22
* @description 普通汽车
**/
public class CommonCar implements Car {
    @Override
    public void drive() {
        System.out.println("普通汽车一般开在城市的大街小巷里");
    }
}
