package com.com;

import com.dao.DeptDao;
import com.service.UserService;
import com.com.service.UserinfoService;
import com.utils.ConnectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_advisor.xml");
        UserService userFactory = context.getBean("userinfoservice", UserService.class);
        Connection conn = ConnectionUtils.getConnection();

        int delete = userFactory.delete(conn, 1);
        System.out.println(delete);
    }
}
