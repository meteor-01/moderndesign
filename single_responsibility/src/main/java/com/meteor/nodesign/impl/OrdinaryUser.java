package com.meteor.nodesign.impl;

import com.meteor.nodesign.IUser;

/*
* @author meteor_01
* @date 2023/8/18
* @description 普通用户
**/
public class OrdinaryUser implements IUser {
    @Override
    public void discount() {
        System.out.println("普通用户，打九折");
    }

    @Override
    public void provideGift() {
        System.out.println("普通用户，不送小礼品");
    }
}
