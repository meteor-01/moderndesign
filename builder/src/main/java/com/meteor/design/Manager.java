package com.meteor.design;

/*
* @author meteor_01
* @date 2023/9/7
* @description 经理,负责制作的流程
**/
public class Manager {
    public void makeHanmberger(Chef chef){
        chef.setBread();
        chef.setSalt();
        chef.setVegetable();
        chef.setChicken();
    }
}
