package com.meteor.nodesign;


import org.junit.Test;

public class AppTest{
    @Test
    public void testDesign(){
        Boss boss = new Boss();
        System.out.println("部门一："+boss.getAveragePerformance("部门一"));
        System.out.println("部门二:"+boss.getAveragePerformance("部门二"));
    }

    @Test
    public void testNodesign(){
        Boss boss = new Boss();
        System.out.println("部门一："+boss.getAveragePerformance("部门一"));
        System.out.println("部门二:"+boss.getAveragePerformance("部门二"));
    }
}
