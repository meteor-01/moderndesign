package com.meteor.design.factory_method;

/*
* @author meteor_01
* @date 2023/9/5
* @description 提供创建咨询服务的工厂
**/
public interface QueryFactory {
    QueryService createQueryService();
}
