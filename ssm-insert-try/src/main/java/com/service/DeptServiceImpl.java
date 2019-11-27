package com.service;

import com.dao.DeptDao;
import com.entity.Dept;
import com.entity.UserInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl {
    @Autowired(required = false)
    private DeptDao deptDao;


    public void insert(Dept dept){
        deptDao.insert(dept);
    }

    public void userAdd(UserInfos userInfos){
        deptDao.userAdd(userInfos);
    }
}
