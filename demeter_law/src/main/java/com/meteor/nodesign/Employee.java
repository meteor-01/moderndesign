package com.meteor.nodesign;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getPerformance() {
        return performance;
    }

    public Employee(String name, String department, double performance) {
        this.name = name;
        this.department = department;
        this.performance = performance;
    }

    public void setPerformance(Double performance) {
        this.performance = performance;
    }
}
