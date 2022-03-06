package com.springtest.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Apple implements Configurations{

    @Override
    public void getSpeedOfPhone() {
        System.out.println("Speed of Apple phone is moderate");
    }
}
