package com.gome.consumer.main;

import com.gome.provider.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"consumer.xml"});
        context.start();
        StudentService stuService = (StudentService) context.getBean("stuService");

        String result = stuService.sayHello("zhangsan");

        System.out.println(result);
    }
}
