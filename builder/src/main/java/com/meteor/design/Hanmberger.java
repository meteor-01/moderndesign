package com.meteor.design;

/*
* @author meteor_01
* @date 2023/9/7
* @description 汉堡类，包含制造汉堡的四个步骤
**/
public class Hanmberger {
    private String vegetable;
    private String salt;
    private String bread;
    private String chicken;

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    @Override
    public String toString() {
        return "Hanmberger{" +
                "vegetable='" + vegetable + '\'' +
                ", salt='" + salt + '\'' +
                ", bread='" + bread + '\'' +
                ", chicken='" + chicken + '\'' +
                '}';
    }
}
