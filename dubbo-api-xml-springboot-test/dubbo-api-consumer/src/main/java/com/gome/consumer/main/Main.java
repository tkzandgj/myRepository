package com.gome.consumer.main;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.gome.provider.service.StudentService;

public class Main {
    public static void apiTest(){

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-consumer");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("120.25.198.165:2181,120.25.198.165:2182,120.25.198.165:2183");
        registryConfig.setProtocol("zookeeper");

        ReferenceConfig<StudentService> referenceConfig = new ReferenceConfig<StudentService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(StudentService.class);

        StudentService stuService = referenceConfig.get();

        System.out.println(stuService.sayHello("tukangzheng"));
    }

    public static void main(String[] args){
        apiTest();
    }
}
