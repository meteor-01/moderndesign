package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.CloudService;
import com.meteor.design.abstract_factory.Factory;
import com.meteor.design.abstract_factory.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 阿里工厂，创建不同的阿里服务
**/
public class AliFactory implements Factory {
    @Override
    public CloudService createCloudService() {
        return new AliCloudService();
    }

    @Override
    public QueryService createQueryService() {
        return new AliQueryService();
    }
}
