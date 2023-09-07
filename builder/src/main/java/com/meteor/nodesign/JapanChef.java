package com.meteor.nodesign;

/*
 * @author meteor_01
 * @date 2023/9/7
 * @description 日本厨师
 **/
public class JapanChef implements Chef {
    private Hanmberger hanmberger;

    public JapanChef(Hanmberger hanmberger) {
        this.hanmberger = hanmberger;
    }

    @Override
    public void cook() {
        hanmberger.setBread("japanbread");
        hanmberger.setSalt("japansalt");
    }
}
