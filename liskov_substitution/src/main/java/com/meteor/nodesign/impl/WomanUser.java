package com.meteor.nodesign.impl;

import com.meteor.nodesign.IUser;

/*
* @author meteor_01
* @date 2023/8/21
* @description 女人实现类
**/
public class WomanUser implements IUser {
    @Override
    public void print(String msg) {
        System.out.println("女人："+msg);
    }
}
