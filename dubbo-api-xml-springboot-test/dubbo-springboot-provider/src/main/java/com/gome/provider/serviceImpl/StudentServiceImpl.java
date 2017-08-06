package com.gome.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gome.provider.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class)
public class StudentServiceImpl implements StudentService {

    @Override
    public String sayHello(String stuName) {
        return "Hello " + stuName;
    }
}
