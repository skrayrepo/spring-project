package com.springtest.model;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Configurations{
    private String price="7000";
    private String os;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void getSpeedOfPhone() {
        System.out.println("Speed of Nokia phone is moderate");
    }
}
