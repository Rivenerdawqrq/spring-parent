package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

/**
 *
 * JoinPoint参数类型是一个比较特殊的类型,所有的通知方法的
 *   第一个参数如果是JoinPoint类型,会自动帮你传进来.
 *
 *   所有的通知方法默认spring都会传递一个参数给你,就是JoinPoint类型
 *   而且这个参数只能通知方法的第一个参数.
 * @author cj
 * @date 2019/10/23
 */
public class LogImpl {

    public void before(JoinPoint joinpoint)

    {
        System.out.println("----" + joinpoint);
        System.out.println("before*********");
    }
    public void after(){
        System.out.println("after*********");
    }
    public void afterReturn(){
        System.out.println("after return*********");
    }

    public void throwAdvice(){
        System.out.println("-----debug: re = ");
        System.out.println("throwAdvice*********");
    }

    /**
     * 环绕通知的参数类型是ProceedingJointPoint类型
     * 它是JoinPoint的子类型
     *
     * 但环绕通知的参数不能写为JoinPoint类型
     *
     *
     *
     * @param joinpoint
     */
    public Object aroundAdvice(ProceedingJoinPoint joinpoint){

        System.out.println("aroundAdvice before*********");
        Object proceed = null;
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
             proceed = joinpoint.proceed();
            System.out.println("aroundAdvice return********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw *********");
        }
        System.out.println("aroundAdvice after*********");
        return proceed;

    }
}
