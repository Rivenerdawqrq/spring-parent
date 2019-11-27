package com.service.impl;

import com.dao.DeptDao;
import com.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class UserServiceImpl {
    private DeptDao deptDao;
    private UserDao userDao;

    public UserServiceImpl(DeptDao deptDao, UserDao userDao) {
        this.deptDao = deptDao;
        this.userDao = userDao;
    }

    @Transactional(readOnly = false)
    public void tx(){
        deptDao.delete();
        userDao.insert();
    }

}
