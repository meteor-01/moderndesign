package com.meteor.design.impl;

import com.meteor.design.Employee;
import com.meteor.design.Factory;

/*
* @author meteor_01
* @date 2023/8/23
* @description 销售工厂，创造销售类
**/
public class SalerFactory implements Factory {
    //根据info或内部需要对Saler做一些初始化操作
    @Override
    public Employee create(String info) {
        return new Saler();
    }
}
