package com.meteor.nodesign.impl;

import com.meteor.nodesign.ICalculation;

/*
* @author meteor_01
* @date 2023/8/18
* @description 计算接口的基本实现类
**/
public class CalculationImpl implements ICalculation {
    private static final double Π = 3.14D;

    @Override
    public double calculateMulti(double r1, double r2) {
        return r1*r2;
    }

    @Override
    public double calculateArea(double r) {
        return Π*r*r;
    }
}
