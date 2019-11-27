package com.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aware.xml");
        SomeBean first = context.getBean("first", SomeBean.class);
        System.out.println(first.getContext() == context);
    }
}
