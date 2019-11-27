package com.service.impl;

import com.dao.DeptDao;
import com.service.DeptService;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public <T> T getAll() {
        return deptDao.getAll();
    }
}
