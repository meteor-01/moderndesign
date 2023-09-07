package com.meteor.design;

/*
* @author meteor_01
* @date 2023/9/7
* @description 中国厨师
**/
public class ChinaChef extends Chef {

    @Override
    protected void setBread() {
        getHanmberger().setBread("中国面包");
    }

    @Override
    protected void setSalt() {
        getHanmberger().setSalt("中国盐");
    }

    @Override
    protected void setVegetable() {
        getHanmberger().setVegetable("中国蔬菜");
    }

    @Override
    protected void setChicken() {
        getHanmberger().setChicken("中国鸡肉");
    }
}
