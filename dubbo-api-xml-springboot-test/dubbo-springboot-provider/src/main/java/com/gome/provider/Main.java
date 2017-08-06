package com.gome.provider;


import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
