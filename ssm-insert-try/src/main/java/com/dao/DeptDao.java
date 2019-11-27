package com.dao;

import com.entity.Dept;
import com.entity.UserInfos;
import org.apache.ibatis.annotations.Param;

public interface DeptDao {

    void insert(@Param("dept") Dept dept);
    void userAdd(@Param("user")UserInfos userInfos);
}
