package com.meteor.design.impl;

import com.meteor.design.Employee;
import com.meteor.design.Factory;

/*
* @author meteor_01
* @date 2023/8/23
* @description 程序员工厂
**/
public class ProgrammerFactory implements Factory {
    //根据info或内部需要对Programmer做一些初始化操作
    @Override
    public Employee create(String info) {
        return new Programmer();
    }
}
