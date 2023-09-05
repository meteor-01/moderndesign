package com.meteor.design.factory_method.impl;


import com.meteor.design.factory_method.QueryFactory;

/*
* @author meteor_01
* @date 2023/9/5
* @description 创建阿里咨询服务的工厂
**/
public class AliQueryServiceFactory implements QueryFactory {
    @Override
    public AliQueryService createQueryService() {
        return new AliQueryService();
    }
}
