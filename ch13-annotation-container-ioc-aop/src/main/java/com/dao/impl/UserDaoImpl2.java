package com.dao.impl;

import com.dao.UserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class UserDaoImpl2 implements UserDao {
    public void insert() {
        System.out.println("ssd2222");

    }

    public int count(int x, int y) {
        return x+y;
    }
}
