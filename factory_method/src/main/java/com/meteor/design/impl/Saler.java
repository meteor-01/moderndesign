package com.meteor.design.impl;

import com.meteor.design.Employee;

/*
* @author meteor_01
* @date 2023/8/23
* @description 销售
**/
public class Saler implements Employee {
    @Override
    public void work() {
        System.out.println("我是销售，我负责卖东西");
    }
}
