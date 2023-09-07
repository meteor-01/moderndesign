package com.meteor.design;

/*
 * @author meteor_01
 * @date 2023/9/7
 * @description 厨师抽象类，定义cook的流程规范
 **/
public abstract class Chef {
    private Hanmberger hanmberger = new Hanmberger();

    public Hanmberger getHanmberger() {
        return hanmberger;
    }

    public void setHanmberger(Hanmberger hanmberger) {
        this.hanmberger = hanmberger;
    }


    protected abstract void setBread();
    protected abstract void setSalt();
    protected abstract void setVegetable();
    protected abstract void setChicken();
}
