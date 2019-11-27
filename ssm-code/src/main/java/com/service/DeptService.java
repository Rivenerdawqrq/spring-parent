package com.service;

import com.dao.DeptDao;
import com.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    @Autowired
    private DeptDao deptDao;

    public void insert(Dept dept){
        deptDao.inser(dept);
    }
}
