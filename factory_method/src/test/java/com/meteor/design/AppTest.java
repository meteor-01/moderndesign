package com.meteor.design;

import com.meteor.design.impl.ProductManagerFactory;
import com.meteor.design.impl.ProgrammerFactory;
import com.meteor.design.impl.SalerFactory;
import com.meteor.nodesign.ProductManager;
import com.meteor.nodesign.Programmer;
import com.meteor.nodesign.Saler;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/23
* @description 测试
**/
public class AppTest{
    // 不采用设计模式
    @Test
    public void testNosign(){
        //需要手动new对象，若对象需要一些初始化工作，也只能自己手动进行
        ProductManager productManager = new ProductManager();
        productManager.communicate();

        Programmer programmer = new Programmer();
        programmer.program();

        Saler saler = new Saler();
        saler.sale();
    }
    // 采用设计模式
    @Test
    public void testDesign(){
        //将对象由工厂创建，既屏蔽了实现的细节，也能加入自己想添加的信息，由于工厂也是抽象的，所以当我们从别的地方接收到参数时，可以直接使用create方法创建对象调用对应的方法即可
        Factory factory = new ProductManagerFactory();
        Employee employee = factory.create("meteor_01");

        Factory factory1 = new SalerFactory();
        Employee employee1 = factory1.create("meteor_01");

        Factory factory2 = new ProgrammerFactory();
        Employee employee2 = factory2.create("meteor_01");

        employee.work();
        employee1.work();
        employee2.work();
    }
}