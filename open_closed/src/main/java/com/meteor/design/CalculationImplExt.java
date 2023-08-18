package com.meteor.design;

import com.meteor.design.impl.CalculationImpl;

/*
* @author meteor_01
* @date 2023/8/18
* @description 扩展类
**/
public class CalculationImplExt extends CalculationImpl {
    //定义自己的 Π 的值，并重写面积计算方法
    private static final double Π = 3.14159;

    @Override
    public double calculateArea(double r) {
        return Π*r*r;
    }
}
