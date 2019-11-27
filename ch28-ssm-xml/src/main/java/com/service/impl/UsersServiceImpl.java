package com.service.impl;

import com.dao.UsersDao;
import com.entity.UserInfos;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao dao;


    @Override
    public List<UserInfos> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }

    @Override
    public void insert(UserInfos userInfos) {
        dao.insert(userInfos);
    }

    @Override
    public void delete() {
        dao.delete();
    }
    @Transactional
    public void insertWithDelete(UserInfos userInfos){
        dao.delete();
        dao.insert(userInfos);
    }

}
