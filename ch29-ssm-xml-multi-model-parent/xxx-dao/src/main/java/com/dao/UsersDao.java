package com.dao;

import com.entity.UsersInfos;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {
    List<UsersInfos> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);

}
