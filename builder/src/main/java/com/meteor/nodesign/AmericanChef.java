package com.meteor.nodesign;

/*
 * @author meteor_01
 * @date 2023/9/7
 * @description 美国厨师
 **/
public class AmericanChef implements Chef {
    private Hanmberger hanmberger;

    public AmericanChef(Hanmberger hanmberger) {
        this.hanmberger = hanmberger;
    }

    @Override
    public void cook() {
        hanmberger.setBread("americanbread");
        hanmberger.setSalt("americansalt");
        hanmberger.setVegetable("americanvegetable");
        hanmberger.setChicken("americanchicken");
    }
}
