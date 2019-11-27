package com.main;

import com.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //创建spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
        UserDao dao = (UserDao) ctx.getBean("first");
        UserDao dao2 = (UserDao) ctx.getBean("first");
        UserDao first = ctx.getBean("first", UserDao.class);

        System.out.println(first);
        System.out.println(dao);
        System.out.println(dao2);
    }
}
