package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 阿里咨询服务
**/
public class AliQueryService implements QueryService {
    @Override
    public void queryService() {
        System.out.println("阿里的咨询服务");
    }

}
