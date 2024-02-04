package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 字节云服务
**/
public class ByteCloudService implements CloudService {
    @Override
    public void cloudService() {
        System.out.println("字节的云服务");
    }
}
