package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_lifecycle.xml");
        UserDaoLifecycle2 life = context.getBean("life2", UserDaoLifecycle2.class);
        ((ConfigurableApplicationContext)context).close();
    }
}
