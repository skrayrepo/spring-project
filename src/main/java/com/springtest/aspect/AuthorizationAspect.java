package com.springtest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorizationAspect {

    @Pointcut("within(com..*)")
    public void authenticationPointcut(){
        //System.out.println("authentication");
    }
    /*@Pointcut("within(com..*)")
    public void authorizationPointcut(){
        System.out.println("authorization");
    }*/

    @Before(value="authenticationPointcut()")
    public void authenticationAthorization(){
        System.out.println("Validation done here");
    }
}
