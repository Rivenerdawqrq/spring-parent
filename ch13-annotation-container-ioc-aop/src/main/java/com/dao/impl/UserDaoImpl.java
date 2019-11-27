package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository()
public class UserDaoImpl implements UserDao {

    public void insert() {
        System.out.println("insert----");
    }

    public int count(int x,int y) {
        return x+y;
    }
}
