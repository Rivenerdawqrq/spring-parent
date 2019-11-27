package com.dao;

public class UserDao extends BasicDao{
    public void deleteByDid(int did){
        jdbcTemplate.update("delete from userinfo where did = ?",did);
    }
}
