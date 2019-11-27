package com.param;

import com.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_param.xml");
        EmployeeServiceImpl serviceImpl = context.getBean("empService", EmployeeServiceImpl.class);
        int add = serviceImpl.add(4, 3);
        System.out.println(add);
    }
}
