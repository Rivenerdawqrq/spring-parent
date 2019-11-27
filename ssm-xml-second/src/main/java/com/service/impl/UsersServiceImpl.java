package com.service.impl;

import com.dao.UsersDao;
import com.entity.UserInfos;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    @Override
    public List<UserInfos> getAll(int pageNum, int pageSize) {
        return usersDao.getAll(pageNum, pageSize);
    }

    @Override
    public void insert(UserInfos userInfos) {
        usersDao.insert(userInfos);
    }
}
