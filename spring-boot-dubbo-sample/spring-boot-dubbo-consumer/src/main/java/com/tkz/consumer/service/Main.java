package com.tkz.consumer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        AbcService bean = run.getBean(AbcService.class);

        System.out.println(bean.echoService.echo("tukangzheng"));
    }
}
