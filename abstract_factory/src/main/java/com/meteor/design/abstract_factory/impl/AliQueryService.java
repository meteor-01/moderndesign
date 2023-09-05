package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 阿里咨询服务
**/
public class AliQueryService implements QueryService {
    @Override
    public void provideQueryService() {
        System.out.println("阿里的咨询服务");
    }
}
