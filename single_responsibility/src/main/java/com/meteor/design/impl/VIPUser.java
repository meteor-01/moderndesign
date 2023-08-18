package com.meteor.design.impl;

import com.meteor.design.IUser;

/*
* @author meteor_01
* @date 2023/8/18
* @description VIP用户
**/
public class VIPUser implements IUser {
    @Override
    public void discount() {
        System.out.println("VIP用户，打五折");
    }

    @Override
    public void provideGift() {
        System.out.println("VIP用户，送一包纸");
    }
}
