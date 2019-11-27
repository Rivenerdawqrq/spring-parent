package com.serviece.impl;

import com.dao.DeptDao;
import com.dao.UserDao;
import com.serviece.DeptService;

public class DeptServiceImpl implements DeptService {
    private UserDao userDao;
    private DeptDao deptDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void deleteWholeDeptById(int id) throws Exception {
            userDao.deleteByDid(id);
            deptDao.deleteById(id);
    }
}
