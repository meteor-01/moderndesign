package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.CloudFactory;
import com.meteor.design.factory_method.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 创建字节云服务的接口
**/
public class ByteCloudServiceFactory implements CloudFactory {
    @Override
    public CloudService createCloudService() {
        return new ByteCloudService();
    }
}
