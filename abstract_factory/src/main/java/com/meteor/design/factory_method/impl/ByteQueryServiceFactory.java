package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.QueryFactory;
import com.meteor.design.factory_method.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 创建字节咨询服务的工厂
**/
public class ByteQueryServiceFactory implements QueryFactory {
    @Override
    public QueryService createQueryService() {
        return new ByteQueryService();
    }
}
