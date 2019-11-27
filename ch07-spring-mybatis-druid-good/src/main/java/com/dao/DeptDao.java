package com.dao;

import com.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    List<Dept>  getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}
