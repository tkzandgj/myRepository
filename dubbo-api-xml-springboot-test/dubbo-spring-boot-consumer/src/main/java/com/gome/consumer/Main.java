package com.gome.consumer;


import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class Main {

    public static void main(String[] args){
        ConfigurableApplicationContext bean = SpringApplication.run(Main.class, args);
        Consumer consumer = bean.getBean(Consumer.class);
        System.out.println(consumer.studentService.sayHello("zhangsan"));
    }
}
