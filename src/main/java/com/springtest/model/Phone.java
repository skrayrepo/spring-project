package com.springtest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    @Qualifier("apple")
    Configurations conf;
    public void getPrice(){
      System.out.println("Price of mobile phone is");
      conf.getSpeedOfPhone();
    }
    public void getDefault(){
        System.out.println("Calling default function");
    }

    public void display(){
        System.out.println("Calling display methos");
    }

}
