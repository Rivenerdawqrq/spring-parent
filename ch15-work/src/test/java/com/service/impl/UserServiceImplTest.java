package com.service.impl;

import com.service.UserService;
import config.annosupport.AnnoSupportConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void tx() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnoSupportConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.tx();
    }
}