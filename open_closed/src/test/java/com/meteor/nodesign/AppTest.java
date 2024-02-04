package com.meteor.nodesign;


import com.meteor.nodesign.impl.CalculationImpl;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/8/18
* @description 测试计算基本类和扩展类的功能
**/
public class AppTest{
    @Test
    public void testCalcuation(){
        ICalculation calculation = new CalculationImpl();
        System.out.println(calculation.calculateArea(3.1D));

        ICalculation calculation1 = new CalculationImplExt();
        System.out.println(calculation1.calculateArea(3.1D));
    }
}
