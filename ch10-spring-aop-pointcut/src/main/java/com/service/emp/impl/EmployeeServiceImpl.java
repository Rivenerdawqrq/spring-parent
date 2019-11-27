package com.service.emp.impl;

import org.aspectj.lang.annotation.Before;

/**
 * @author cj
 * @date 2019/10/28
 */
public class EmployeeServiceImpl extends AbsEmployeeServiceImpl {

    public void getAll() {
        System.out.println("getAll in employeeServiceImpl");
    }


    public void getById() {
        System.out.println("getById in employeeServiceImpl");

    }

    @Before("@within(com.service.emp.)")
    public void deleteById() {
        System.out.println("delete in employeeServiceImpl");
    }

    /**
     * 此方法主要用来测试+这个符号
     */
    public void xxx(){
        System.out.println("xxx");
    }
}
