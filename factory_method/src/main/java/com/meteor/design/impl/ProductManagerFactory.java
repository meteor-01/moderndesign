package com.meteor.design.impl;

import com.meteor.design.Employee;
import com.meteor.design.Factory;

/*
* @author meteor_01
* @date 2023/8/23
* @description 产品经理工厂
**/
public class ProductManagerFactory implements Factory {
    //根据info或内部需要对ProductManager做一些初始化操作
    @Override
    public Employee create(String info) {
        return new ProductManager();
    }
}
