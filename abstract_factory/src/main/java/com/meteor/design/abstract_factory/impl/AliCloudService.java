package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.CloudService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 阿里云服务
**/
public class AliCloudService implements CloudService {
    @Override
    public void provideCloudService() {
        System.out.println("阿里的云服务");
    }
}
