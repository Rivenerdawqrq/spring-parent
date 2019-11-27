package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cj
 * @date 2019/10/23
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl service = context.getBean("serviceImpl", EmployeeServiceImpl.class);
       service.add(3,3);
//        service.update();
    }
}
