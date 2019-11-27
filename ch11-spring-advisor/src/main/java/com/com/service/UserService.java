package com.service;

import com.utils.ConnectionUtils;

import java.sql.Connection;

public interface UserService {

    int delete(Connection conn,int id);
}
