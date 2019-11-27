package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void delete() {
        String sql = "delete from dept where id=14";
        jdbcTemplate.update(sql);
    }
}
