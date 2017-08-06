package com.gome.consumer;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.gome.provider.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @DubboConsumer
    public StudentService studentService;

    /*public void sayHello(){
        System.out.println(studentService.sayHello("tukangzheng"));
    }*/
}
