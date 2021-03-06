package com.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtils {

    private static final String URL = "jdbc:mysql://localhost:3306/work";
    private static final String DRIVERCLASSNAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    static {
        try {
            Class.forName(DRIVERCLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("驱动加载失败");
        }
    }

    public static Connection getConnection() {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("获取连接失败");
        }
    }

}
