package com.meteor.design;


import com.meteor.nodesign.Animal;
import com.meteor.nodesign.impl.Cat;
import com.meteor.nodesign.impl.Tiger;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/22
* @description 测试
**/
public class AppTest{
    //不采用接口隔离
    @Test
    public void testNodesign(){
        Animal cat = new Cat();
        cat.eat();
        //猫不会狩猎，但能调用狩猎方法，存在问题
        cat.hunt();
        cat.sleep();

        Animal tiger = new Tiger();
        //老虎不会吃饭，但能调用吃饭方法，存在问题
        tiger.eat();
        tiger.hunt();
        tiger.sleep();
    }
    //采用接口隔离
    @Test
    public void testDesign(){
        //此时tiger只具备狩猎能力，若需要睡觉功能，用Tiger声明对象，但无论怎么声明，都不存在eat方法，即没有吃饭能力
        Hunting tiger = new com.meteor.design.impl.Tiger();
        tiger.hunt();

        //此时cat只具备吃饭能力，若需要睡觉功能，用Cat声明对象，但无论怎么声明，都不存在hunt方法，即没有狩猎能力
        Dining cat = new com.meteor.design.impl.Cat();
        cat.eat();
    }
}