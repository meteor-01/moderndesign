package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 阿里云服务
**/
public class AliCloudService implements CloudService {
    @Override
    public void cloudService() {
        System.out.println("阿里的云服务");
    }
}
