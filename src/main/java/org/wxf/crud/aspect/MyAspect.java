package org.wxf.crud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* org.wxf.crud.controller.BookController.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
    }


    @After("execution(* org.wxf.crud.controller.BookController.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }
}
