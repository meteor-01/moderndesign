package com.meteor.design;

import com.meteor.design.impl.BlackcardUser;
import com.meteor.design.impl.OrdinaryUser;
import com.meteor.design.impl.VIPUser;
import com.meteor.nodesign.Shop;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/18
* @description 测试两种方式实现相同功能的区别
**/
public class AppTest 
{
    //测试不用单一职责原则的商店类
    @Test
    public void testNodesign(){
        Shop shop = new Shop();
        shop.identify("普通用户");
        shop.identify("VIP用户");
        shop.identify("用户");
    }

    //测试使用单一职责原则的用户类
    @Test
    public void testDesign(){
        IUser ordinaryUser = new OrdinaryUser();
        ordinaryUser.discount();
        ordinaryUser.provideGift();

        IUser vipUser = new VIPUser();
        vipUser.discount();
        vipUser.provideGift();

        IUser blackcardUser = new BlackcardUser();
        blackcardUser.discount();
        blackcardUser.provideGift();
    }
}
