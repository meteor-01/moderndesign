package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 字节云服务
**/
public class ByteCloudService implements CloudService {
    @Override
    public void provideCloudService() {
        System.out.println("字节的云服务");
    }
}
