package com.service.impl;

import com.dao.DeptDao;
import com.entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DeptServiceImpl {
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public List<Dept>  getAll(int pageNum,int pageSize) {
        return deptDao.getAll(pageNum,pageSize);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptServiceImpl deptService = context.getBean("deptService", DeptServiceImpl.class);
        List<Dept> all = deptService.getAll(1,2);
        for (Dept dept : all) {
            System.out.println(dept);
        }
    }
}

