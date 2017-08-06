package com.tkz.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.tkz.provider.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class AbcService {

    @Reference(version = "1.0.0")
    public EchoService echoService;
}
