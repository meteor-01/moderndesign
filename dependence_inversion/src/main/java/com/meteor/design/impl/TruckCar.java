package com.meteor.design.impl;

import com.meteor.design.Car;

/*
* @author meteor_01
* @date 2023/8/22
* @description 货车
**/
public class TruckCar implements Car {
    @Override
    public void drive() {
        System.out.println("货车一般开在高速公路上");
    }
}
