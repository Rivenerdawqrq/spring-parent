package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoLifecycle2 implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("destroy------");
    }
    // 方法名：属性设置完毕后
//意思：此类中各种setter方法被调用后 才 调用这个初始化方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");
    }
}
