package com.com.service;

import com.dao.DeptDao;
import com.dao.UserDao;
import com.service.UserService;

import java.sql.Connection;

public class UserinfoService implements UserService {

    DeptDao deptDao = new DeptDao();
    UserDao userDao = new UserDao();

    public int deleteDeptWithUser(Connection conn,int id) {
        return deptDao.deleteDeptById(conn,id);
    }

    public int deleteUserWithUser(Connection conn,int id) {
        return userDao.deleteUserById(conn,id);
    }

    public int delete(Connection conn, int id) {
        int resutl = 0;
        resutl += this.deleteUserWithUser(conn, id);
        resutl += this.deleteDeptWithUser(conn, id);
        return resutl;
    }

}
