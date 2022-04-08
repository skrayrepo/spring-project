package com.springtest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* com.springtest.*.Phone.getPrice())")
    public void beforeMessage(){
        System.out.println("Calling this before executing getPrice()");
    }

    @After("execution(* com.springtest.*.Phone.getPrice())")
    public void afterMessage(){
        System.out.println("Calling this after executing getPrice()");
    }
}
