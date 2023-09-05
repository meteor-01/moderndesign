package com.meteor.design;


import com.meteor.design.abstract_factory.CloudService;
import com.meteor.design.abstract_factory.Factory;
import com.meteor.design.abstract_factory.QueryService;
import com.meteor.design.abstract_factory.impl.AliFactory;
import com.meteor.design.abstract_factory.impl.ByteFactory;
import com.meteor.nodesign.AliService;
import com.meteor.nodesign.ByteService;
import org.junit.Test;

/*
* @author meteor_01
* @date 2023/9/5
* @description 测试
**/
public class AppTest{
    // 不采用设计模式,可以看出，对象需要手动创建，若有初始化操作也要手动进行，且不同公司实现相同功能的方法不同，随着公司越来越多，客户端需要记住的方法名也就越来越多
    @Test
    public void testNodesign(){
        AliService aliService = new AliService();
        aliService.aliQueryService();
        aliService.aliCloudService();

        ByteService byteService = new ByteService();
        byteService.byteCloudService();
        byteService.byteQueryService();
    }

    //将对象由工厂创建，既屏蔽了实现的细节，也能加入自己想添加的信息，由于工厂也是抽象的，所以当我们从别的地方接收到参数时，可以直接使用create方法创建对象，对象是抽象的，所以方法是在抽象类中固定的，直接调用对应的方法即可。缺点就是会创建大量的工厂类
    @Test
    public void testFactoryMethod(){
        //阿里咨询服务
//        QueryFactory aliQueryServiceFactory = new AliQueryServiceFactory();
//        QueryService aliQueryService = aliQueryServiceFactory.createQueryService();
//        aliQueryService.queryService();

        //字节咨询服务
//        QueryFactory byteQueryServiceFactory = new ByteQueryServiceFactory();
//        QueryService byteQueryService = byteQueryServiceFactory.createQueryService();
//        byteQueryService.queryService();

        //阿里云服务
//        CloudFactory aliCloudServiceFactory = new AliCloudServiceFactory();
//        CloudService aliCloudService = aliCloudServiceFactory.createCloudService();
//        aliCloudService.cloudService();

        //字节云服务
//        CloudFactory byteCloudServiceFactory = new ByteCloudServiceFactory();
//        CloudService byteCloudService = byteCloudServiceFactory.createCloudService();
//        byteCloudService.cloudService();

    }

    //抽象工厂模式主要是将方法的不同实现进行划分，不同方法的同一种类型的实现的创建放到同一个类中，减少了工厂的创建
    @Test
    public void testAbstractFactory(){
        //阿里的云服务和咨询服务
        Factory aliFactory = new AliFactory();
        CloudService aliCloudService = aliFactory.createCloudService();
        aliCloudService.provideCloudService();
        QueryService aliQueryService = aliFactory.createQueryService();
        aliQueryService.provideQueryService();

        //字节的云服务和咨询服务
        ByteFactory byteFactory = new ByteFactory();
        CloudService byteCloudService = byteFactory.createCloudService();
        byteCloudService.provideCloudService();
        QueryService byteQueryService = byteFactory.createQueryService();
        byteQueryService.provideQueryService();
    }

}
