package com.meteor.design.impl;

import com.meteor.design.Employee;

/*
* @author meteor_01
* @date 2023/8/23
* @description 程序员
**/
public class Programmer implements Employee {
    @Override
    public void work(){
        System.out.println("我是程序员，我负责开发程序");
    }
}
