package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BasicDao {
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
