package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

//@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
       //注册了一个servlet
        ServletRegistration.Dynamic servletRegistration =
            servletContext.addServlet("first",new FirstServlet());

        servletRegistration.addMapping("/first");
//        for (Class<?> aClass : set) {
//            //判断传递过来的类型是否是实现MyAppInitializer的实现类
//            if (MyAppInitializer.class.isAssignableFrom(aClass)) {
//                try {
//                    MyAppInitializer instance = (MyAppInitializer) aClass.newInstance();
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
