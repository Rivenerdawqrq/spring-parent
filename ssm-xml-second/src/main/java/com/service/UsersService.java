package com.service;

import com.entity.UserInfos;

import java.util.List;

public interface UsersService {
    List<UserInfos> getAll(int pageNum,int pageSize);
    void insert(UserInfos userInfos);
}
