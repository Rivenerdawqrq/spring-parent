package com.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext context;

    public void setBeanName(String s) {

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getContext(){
        return this.context;
    }


}
