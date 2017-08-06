package com.gome.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.gome.provider.service.StudentService;
import com.gome.provider.serviceImpl.StudentServiceImpl;

import java.io.IOException;

public class Main {

    public static void apiTest(){
        StudentService stuService = new StudentServiceImpl();

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-provider");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("120.25.198.165:2181,120.25.198.165:2182,120.25.198.165:2183");
        registryConfig.setProtocol("zookeeper");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");


        ServiceConfig<StudentService> service = new ServiceConfig<StudentService>();
        service.setApplication(applicationConfig);
        service.setRegistry(registryConfig);
        service.setProtocol(protocolConfig);
        service.setInterface(StudentService.class);
        service.setRef(stuService);

        service.export();
    }

    public static void main(String[] args){
        apiTest();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
