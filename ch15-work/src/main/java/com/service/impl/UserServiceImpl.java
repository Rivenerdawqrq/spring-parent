package com.service.impl;

import com.dao.DeptDao;
import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private UserDao userDao;

    @Transactional
    public void tx() {
        deptDao.delete();
//        int i = 10/0;
        userDao.insert();
    }
}
