package com.test;

import com.DbConfig;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService bean = context.getBean(UserService.class);
//        System.out.println(bean.count(2, 2));


        DbConfig bean = context.getBean(DbConfig.class);
        System.out.println(bean.getPwd());
    }
}
