package com.meteor.design.abstract_factory;

/*
* @author meteor_01
* @date 2023/9/5
* @description 工厂接口，提供创造服务的规范
**/
public interface Factory {
    CloudService createCloudService();

    QueryService createQueryService();
}
