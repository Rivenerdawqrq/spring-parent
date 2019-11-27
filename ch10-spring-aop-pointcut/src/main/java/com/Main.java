package com;

import com.service.emp.EmployeeService;
import com.service.emp.impl.EmployeeServiceImpl;
import com.service.emp.impl.EmployeeServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cj
 * @date 2019/10/28
 */
public class Main {
    public static void main(String[] args) {
//        testByBeanImpl();

//        testByBeanInf();

//        testMultiImpl();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl employeeService = context.getBean("emp", EmployeeServiceImpl.class);
        employeeService.getAll();
        employeeService.getById();
        employeeService.deleteById();
        employeeService.xxx();
    }


    private static void testByBeanImpl() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl employeeService = context.getBean("emp", EmployeeServiceImpl.class);
        employeeService.getAll();
        employeeService.getById();
        employeeService.deleteById();
        employeeService.xxx();
    }

    /**
     * 此方法主要以接口类型获取bean的实例,主要的目标是演示this指示器
     *
     * 假定指示器为:this(com.service.emp.impl.EmployeeServiceImpl)
     *
     * 1. 当proxy-target-class属性没有设置(等于false)时:
     *      动态代理类"不是"EmployeeServiceImpl的子类型,不满足this条件,
     *      所以不进行aop代理
     * 2. 当proxy-target-class=true时:
     *      动态代理类"是"EmployeeServiceImpl的子类型,满足this条件
     *      所以进行aop代理
     *
     */
    private static void testByBeanInf() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = context.getBean("emp", EmployeeService.class);
        employeeService.getAll();
        employeeService.getById();
        employeeService.deleteById();
    }


    private static void testMultiImpl() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl employeeService = context.getBean("emp", EmployeeServiceImpl.class);
        employeeService.getAll();
        employeeService.getById();
        employeeService.deleteById();
        employeeService.xxx();


        EmployeeServiceImpl2 employeeService2 = context.getBean("emp2", EmployeeServiceImpl2.class);
        employeeService2.getAll();
        employeeService2.getById();
        employeeService2.deleteById();
        employeeService2.yyy();
    }
}
