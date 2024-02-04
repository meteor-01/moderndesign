package com.meteor.design.abstract_factory.impl;

import com.meteor.design.abstract_factory.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 字节咨询服务
**/
public class ByteQueryService implements QueryService {
    @Override
    public void provideQueryService() {
        System.out.println("字节的咨询服务");
    }
}
