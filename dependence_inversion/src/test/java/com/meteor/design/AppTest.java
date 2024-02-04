package com.meteor.design;

import com.meteor.design.impl.CommonCar;
import com.meteor.design.impl.TruckCar;
import com.meteor.nodesign.Car;
import com.meteor.nodesign.Driver;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/22
* @description 测试
**/
public class AppTest{
    //不使用依赖倒置,此时driver只能接收Car类型的对象，如果增加其它类型的车就需要新增类以及在Driver类中新增方法接收对应的类
    @Test
    public void testNodesign(){
        Driver driver = new Driver();
        Car car = new Car();
        driver.driveCar(car);
    }

    //使用依赖倒置，此时若要添加新的车，只需要新增Car的实现类即可，不会影响Driver调用方法
    @Test
    public void testDesign(){
        com.meteor.design.Driver driver = new com.meteor.design.Driver();
        com.meteor.design.Car car = new TruckCar();
        driver.drive(car);

        car = new CommonCar();
        driver.drive(car);
    }
}
