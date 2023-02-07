package com.springtest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* com.springtest.*.*.get*())")
    public void beforeMessage1(){
        System.out.println("Calling Advice 1 before executing all get*()");
    }

    @Before("getAllPriceCall()")
    public void beforeMessage2(){
        System.out.println("Calling Advice 2 before getPrice()");
    }

    @Before("getAllPriceCall()")
    public void beforeMessage3(){
        System.out.println("Calling Advice 3 before getPrice()");
    }

    @Before("callAllMethodWithinAClass()")
    public void beforeMessage4(){
        System.out.println("Calling Advice 4 before getPrice()");
    }

    @Pointcut("execution(* com.springtest.*.Phone.getPrice())")
    public void getAllPriceCall(){

    }

    @Pointcut("within(com.springtest.*.Phone)")
    public void callAllMethodWithinAClass(){}

    @After("execution(* com.springtest.*.Phone.getPrice())")
    public void afterMessage(){
        System.out.println("Calling this after executing getPrice()");
    }


}
