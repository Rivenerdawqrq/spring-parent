package com.param;

import org.aspectj.lang.ProceedingJoinPoint;

public class ParamAspect {
    public void before(int a,int b){
        System.out.println("a---"+a);
        System.out.println("b---"+b);
    }

    public Object aroundParam(ProceedingJoinPoint joinPoint){
        Object result = null;

        try {
            result = joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        Object[] args = joinPoint.getArgs();
        for(int i=0;i<args.length;i++){
            System.out.println("-----debug: args[i] = " + args[i]);
        }
        return result;
    }
}
