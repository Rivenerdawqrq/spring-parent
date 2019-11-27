package com.service;

import com.dao.UsersDao;
import com.entity.UserInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl {
    @Autowired(required = false)
    private UsersDao usersDao;
    
    public List<UserInfos> getAll(int pageNum,int pageSize){
        return usersDao.getAll(pageNum,pageSize);
    }
    
    public int insert(UserInfos userInfos){
        return usersDao.insert(userInfos);
    }
}
