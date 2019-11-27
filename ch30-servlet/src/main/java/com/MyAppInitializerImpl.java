package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyAppInitializer {
    @Override
    public void qidongshi(ServletContext context) {
        ServletRegistration.Dynamic servletRegistration =
                context.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
