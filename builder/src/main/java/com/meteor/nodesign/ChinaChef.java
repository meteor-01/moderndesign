package com.meteor.nodesign;

/*
 * @author meteor_01
 * @date 2023/9/7
 * @description 中国厨师
 **/
public class ChinaChef implements Chef {
    private Hanmberger hanmberger;

    public ChinaChef(Hanmberger hanmberger) {
        this.hanmberger = hanmberger;
    }

    @Override
    public void cook() {
        hanmberger.setBread("chinabread");
        hanmberger.setSalt("chinasalt");
        hanmberger.setVegetable("chinavegetable");
        hanmberger.setChicken("chinachicken");
    }
}
