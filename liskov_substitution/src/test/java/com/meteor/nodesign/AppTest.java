package com.meteor.nodesign;

import com.meteor.nodesign.impl.ManUser;
import com.meteor.nodesign.impl.WomanUser;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/21
* @description 测试里氏替换原则
**/
public class AppTest {
    @Test
    public void testUser(){
        IUser user = null;

        user = new ManUser();
        user.print("meteor_01");

        user = new WomanUser();
        user.print("meteor_01");
    }
}
