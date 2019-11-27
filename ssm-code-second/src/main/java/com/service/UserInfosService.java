package com.service;

import com.dao.UserInfosDao;
import com.entity.UserInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfosService {
    @Autowired
    private UserInfosDao userInfosDao;

    public List<UserInfos> getAll(int pageNum,int pageSize){
        return userInfosDao.getAll(pageNum,pageSize);

    }

    public void insert(UserInfos userInfos){
       userInfosDao.insert(userInfos);
    }

}
