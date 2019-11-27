package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl service = context.getBean("service", UserServiceImpl.class);
        service.delete();
        System.out.println("----2323");
        service.update();
    }
}
