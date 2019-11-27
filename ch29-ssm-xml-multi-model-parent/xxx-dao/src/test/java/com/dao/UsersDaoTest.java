package com.dao;

import com.entity.UsersInfos;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dao-spring.xml")
public class UsersDaoTest {
    @Autowired
    private UsersDao usersDao;
    @Test
    public void getAll(){
        List<UsersInfos> all = usersDao.getAll(1, 2);
        for (UsersInfos usersInfos : all) {
            System.out.println(usersInfos);
        }
    }
}
