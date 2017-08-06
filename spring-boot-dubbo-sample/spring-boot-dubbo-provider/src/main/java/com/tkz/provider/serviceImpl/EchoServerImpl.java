package com.tkz.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tkz.provider.service.EchoService;

@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    @Override
    public String echo(String str) {
        System.out.println(str);
        return "Hello " + str;
    }
}
