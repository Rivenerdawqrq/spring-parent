package com.service;

import com.entity.UsersInfos;

import java.util.List;

public interface UsersService {
    List<UsersInfos> getAll(int pageNum, int pageSize);
}
