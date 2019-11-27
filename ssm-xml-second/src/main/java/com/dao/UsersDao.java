package com.dao;

import com.entity.UserInfos;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {
    List<UserInfos> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    void insert(UserInfos userInfos);
}
