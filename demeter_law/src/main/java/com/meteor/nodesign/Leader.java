package com.meteor.nodesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * @author meteor_01
 * @date 2023/8/21
 * @description 领导
 **/
public class Leader {
    private String department;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Leader(String department, String name) {
        this.department = department;
        this.name = name;
        //随机生成员工绩效
        Random random = new Random();
        Collections.addAll(employees, new Employee(name + "_meteor_01", department, random.nextInt(100)), new Employee(name + "_meteor_02", department, random.nextInt(100)), new Employee(name + "_meteor_03", department, random.nextInt(100)));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
