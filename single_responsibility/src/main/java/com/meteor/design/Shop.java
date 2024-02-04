package com.meteor.design;

/*
* @author meteor_01
* @date 2023/8/18
* @description 商店类，不采用单一职责原则
**/
public class Shop {
    // 有时候并不会看你是不是黑卡用户，而只会看你是不是普通用户，因为比起舔，更多的人喜欢踩
    public void identify(String person){
        if("普通用户".equals(person)){
            System.out.println("普通用户，打九折");
            System.out.println("普通用户，不送小礼品");
        }
        else if("VIP用户".equals(person)){
            System.out.println("VIP用户，打五折");
            System.out.println("VIP用户，送一包纸");
        }
        else{
            System.out.println("黑卡用户，免费");
            System.out.println("黑卡用户，送跑跑卡丁车");
        }
    }
}
