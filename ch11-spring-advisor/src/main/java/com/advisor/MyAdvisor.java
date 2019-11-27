package com.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.sql.Connection;

public class MyAdvisor implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("ok");
    }


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;

        Object[] arguments = methodInvocation.getArguments();

        Connection connection = (Connection) arguments[0];
        connection.setAutoCommit(false);

        try {
            result =  methodInvocation.proceed();
        } catch (Throwable th) {
            connection.rollback();
        }
        connection.commit();
        connection.setAutoCommit(true);
        connection.close();
        return result;
    }
}
