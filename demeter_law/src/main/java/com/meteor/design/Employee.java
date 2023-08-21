package com.meteor.design;

/*
 * @author meteor_01
 * @date 2023/8/21
 * @description 员工
 **/
public class Employee {
    private String name;
    private String department;

    private Double performance;

    public Employee() {

    }

    public Double getPerformance() {
        return performance;
    }

    public Employee(String name, String department, double performance) {
        this.name = name;
        this.department = department;
        this.performance = performance;
    }
}
