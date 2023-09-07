package com.meteor.design;

/*
* @author meteor_01
* @date 2023/9/7
* @description 日本厨师
**/
public class JapanChef extends Chef {
    private Hanmberger hanmberger;
    @Override
    protected void setBread() {
        getHanmberger().setBread("日本面包");
    }

    @Override
    protected void setSalt() {
        getHanmberger().setSalt("日本盐");
    }

    @Override
    protected void setVegetable() {
        getHanmberger().setVegetable("日本蔬菜");
    }

    @Override
    protected void setChicken() {
        getHanmberger().setChicken("日本鸡肉");
    }
}
