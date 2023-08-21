package com.meteor.design;

import java.util.HashMap;
import java.util.Map;

/*
 * @author meteor_01
 * @date 2023/8/21
 * @description 老板
 **/
public class Boss {
    //存储部门和leader的映射关系
    private Map<String, Leader> map = new HashMap<>();

    public Boss() {
        map.put("部门一", new Leader("部门一", "leader1"));
        map.put("部门二", new Leader("部门二", "leader2"));
        map.put("部门三", new Leader("部门三", "leader3"));
        map.put("部门四", new Leader("部门四", "leader4"));
    }

    //获取某个部门员工的平均绩效
    public Double getAveragePerformance(String department) {
        return map.get(department).getAveragePerformance();
    }
}
