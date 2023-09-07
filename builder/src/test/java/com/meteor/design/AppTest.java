package com.meteor.design;

import com.meteor.nodesign.AmericanChef;
import com.meteor.nodesign.ChinaChef;
import com.meteor.nodesign.Hanmberger;
import com.meteor.nodesign.JapanChef;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/9/7
* @description 测试
**/
public class AppTest{
    //测试不采用设计模式，可见，当不控制流程的时候，虽然提供的功能是想要的，但效果不是想要的，有点挂羊头卖狗肉的感觉
    @Test
    public void testNodesign(){
        //假设我想要一个汉堡,第一次在美国吃
        Hanmberger americanHanmberger = new Hanmberger();
        AmericanChef americanChef = new AmericanChef(americanHanmberger);
        americanChef.cook();
        System.out.println(americanHanmberger);

        //回国后再次想吃汉堡，第二次在国内吃,但是国内与国外的流程不同，味道相差很大
        Hanmberger chinaHanmberger = new Hanmberger();
        ChinaChef chinaChef = new ChinaChef(chinaHanmberger);
        chinaChef.cook();
        System.out.println(chinaHanmberger);

        //去了日本，第三次试吃，但是日本不仅流程不一样，还少了两个步骤
        Hanmberger japanHanmberger = new Hanmberger();
        JapanChef japanChef = new JapanChef(japanHanmberger);
        japanChef.cook();
        System.out.println(japanHanmberger);
    }

    //测试采用设计模式，利用经理这个类控制执行流程，厨师抽象类控制每个汉堡必须具备的制作步骤，剩下的就是制作具有自己风格但相差不大的汉堡了
    @Test
    public void testDesign(){
        //假设我想吃汉堡，我就跟经理说，给我做一个汉堡，但汉堡不同国家都有厨师能做，所以我要告诉它我想吃哪个厨师做的
        com.meteor.design.ChinaChef chinaChef = new com.meteor.design.ChinaChef();
        Manager manager = new Manager();
        manager.makeHanmberger(chinaChef);
        //然后经理就会指挥厨师按照标准流程做汉堡，由于每次都是经理指挥且用料、流程固定，因此中国汉堡和国外汉堡差距不大
        System.out.println(chinaChef.getHanmberger());

        com.meteor.design.AmericanChef americanChef = new com.meteor.design.AmericanChef();
        manager.makeHanmberger(americanChef);
        System.out.println(americanChef.getHanmberger());
    }
}
