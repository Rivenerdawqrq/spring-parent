package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Service
@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public void insert() {
        userDao.insert();
    }

    public int count(int x,int y) {
        return x+y;
    }

    @PostConstruct
    public void init(){
        System.out.println("init---");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy---");
    }
}
