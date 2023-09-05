package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.CloudFactory;
import com.meteor.design.factory_method.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 创建阿里云服务的工厂
**/
public class AliCloudServiceFactory implements CloudFactory {
    @Override
    public CloudService createCloudService() {
        return new AliCloudService();
    }
}
