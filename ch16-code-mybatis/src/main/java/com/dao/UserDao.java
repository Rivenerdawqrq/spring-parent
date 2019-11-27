package com.dao;

import com.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<UserInfo> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    void insert();
}
