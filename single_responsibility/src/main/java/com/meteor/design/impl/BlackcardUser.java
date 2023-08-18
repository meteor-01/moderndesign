package com.meteor.design.impl;

import com.meteor.design.IUser;

/*
* @author meteor_01
* @date 2023/8/18
* @description 黑卡用户
**/
public class BlackcardUser implements IUser {
    @Override
    public void discount() {
        System.out.println("黑卡用户，免费");

    }

    @Override
    public void provideGift() {
        System.out.println("黑卡用户，送跑跑卡丁车");
    }
}
