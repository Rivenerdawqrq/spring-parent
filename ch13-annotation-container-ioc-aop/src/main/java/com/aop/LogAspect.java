package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component //表示被spring管理起来
@Aspect  //此类为切面类
public class LogAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }
    @Before("myPointcut()")
    public void before(){
        System.out.println("before");
    }
    @After("myPointcut()")
    public void after(){
        System.out.println("after");
    }
    @AfterReturning(pointcut = "myPointcut()",returning = "ret")
    public void afterReturn(int ret){
        System.out.println("after return"+ret);
    }

    /**
     * 当解析不了参数名时,才需要指定argNames.值就是通知方法的名字,
     * 但能解析到方法参数名时,不需要指定argNames
     * @param re
     */
    @AfterThrowing(pointcut = "myPointcut()",throwing = "re",argNames = "re")
    public void afterThrow(RuntimeException re){
        System.out.println("after throw----" + re);
    }

    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            result = joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }


}
