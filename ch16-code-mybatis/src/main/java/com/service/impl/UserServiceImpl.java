package com.service.impl;

import com.dao.DeptDao;
import com.dao.UserDao;
import com.entity.UserInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private DeptDao deptDao;

    public List<UserInfo> getAll(int pageNum, int pageSize) {
        return userDao.getAll(pageNum,pageSize);
    }
    @Transactional
    public void delWithInsert() {
        deptDao.delete();
        userDao.insert();
    }



}
