package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.CloudService;
import com.meteor.design.abstract_factory.Factory;
import com.meteor.design.abstract_factory.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 字节工厂，创建不同的字节服务
**/
public class ByteFactory implements Factory {
    @Override
    public CloudService createCloudService() {
        return new ByteCloudService();
    }

    @Override
    public QueryService createQueryService() {
        return new ByteQueryService();
    }
}
