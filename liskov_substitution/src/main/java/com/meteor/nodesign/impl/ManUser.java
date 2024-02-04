package com.meteor.nodesign.impl;

import com.meteor.nodesign.IUser;

/*
* @author meteor_01
* @date 2023/8/21
* @description 男人实现类
**/
public class ManUser implements IUser {
    @Override
    public void print(String msg) {
        System.out.println("男人："+msg);
    }
}
