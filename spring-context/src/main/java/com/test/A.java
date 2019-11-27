package com.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, FactoryBean {
        private B b;

        public A(B b){
            System.out.println("构造");
            this.b = b;
        }

        public void setB(B b) {
            System.out.println("set----");
            this.b = b;
        }

        public void init(){
            System.out.println("init -----");
        }


        public Object getObject() throws Exception {
            System.out.println("getObject----");
            return new B();
        }

        public Class<?> getObjectType() {
            System.out.println("getObjectType--------");
            return B.class;
        }

        public void afterPropertiesSet() throws Exception {
            System.out.println("after -- - - - -");
        }
}
