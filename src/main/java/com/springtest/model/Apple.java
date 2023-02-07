package com.springtest.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Apple implements Configurations{

    public void getSpeedOfPhone() {
        System.out.println("Speed of Apple phone is moderate");
    }
}
