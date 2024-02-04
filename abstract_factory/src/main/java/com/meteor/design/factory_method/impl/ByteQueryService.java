package com.meteor.design.factory_method.impl;

import com.meteor.design.factory_method.QueryService;

/*
* @author meteor_01
* @date 2023/9/5
* @description 字节咨询服务
**/
public class ByteQueryService implements QueryService {
    @Override
    public void queryService() {
        System.out.println("字节的咨询服务");
    }

}
