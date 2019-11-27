package com.service;

import com.entity.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> getAll(int pageNum, int pageSize);
    void delWithInsert();
}
