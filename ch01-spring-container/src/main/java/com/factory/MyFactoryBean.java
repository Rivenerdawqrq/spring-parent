package com.factory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<L> {
    //这个方法用来创建一个对象
    public L getObject() throws Exception {
        return new L();
    }
    //这个方法是用来表明此工厂Bean创建出来的对象的class
    public Class<?> getObjectType() {
        return L.class;
    }
    //这个方法表明此工厂Bean创建出来的对象,在sping管理下的作用域
    //true表示是singleton
    public boolean isSingleton() {
        return true;
    }
}
