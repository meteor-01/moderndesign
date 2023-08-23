package com.meteor.design.impl;


import com.meteor.design.Employee;

/*
* @author meteor_01
* @date 2023/8/23
* @description 产品经理
**/
public class ProductManager implements Employee {
    @Override
    public void work(){
        System.out.println("我是产品经理，我负责和用户沟通");
    }
}
