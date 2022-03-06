package com.springtest.controller;

import com.springtest.SpringConfig;
import com.springtest.model.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestCintroller {
    public static void main(String[] args){
        //ApplicationContext context;
        //context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Phone phone = context.getBean(Phone.class);
        phone.getPrice();
    }
}
