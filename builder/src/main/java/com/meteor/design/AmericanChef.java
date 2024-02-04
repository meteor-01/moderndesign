package com.meteor.design;

/*
 * @author meteor_01
 * @date 2023/9/7
 * @description 美国厨师
 **/
public class AmericanChef extends Chef {

    @Override
    protected void setBread() {
        getHanmberger().setBread("美国面包");
    }

    @Override
    protected void setSalt() {
        getHanmberger().setSalt("美国盐");
    }

    @Override
    protected void setVegetable() {
        getHanmberger().setVegetable("美国蔬菜");
    }

    @Override
    protected void setChicken() {
        getHanmberger().setChicken("美国鸡肉");
    }
}
