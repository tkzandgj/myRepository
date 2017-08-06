package com.gome.provider.serviceImpl;

import com.gome.provider.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public String sayHello(String stuName) {
        return "Hello " + stuName;
    }
}
