package com.meteor.design.factory_method;

/*
* @author meteor_01
* @date 2023/9/5
* @description 提供创建云服务的接口
**/
public interface CloudFactory{
    CloudService createCloudService();
}
