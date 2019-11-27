package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insert() {
        String sql = "insert into userinfo(id,username) values('40','jiu3jiu')";
        jdbcTemplate.update(sql);
    }
}
