package com.lifecycle;

public class UserDaoLifecycle {
    public void init(){
        System.out.println("初始化。。。no构造函数");
    }

    public void init2(){
        System.out.println("22222");
    }
    public void destroy(){
        System.out.println("销毁");
    }

}
