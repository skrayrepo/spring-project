package com.springtest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    Nokia nokia;
    @Autowired
    //@Qualifier("apple")
    Configurations config;
/*    public Phone(Nokia nokia){
        this.nokia = nokia;
    }*/

    public Configurations getConfig() {
        return config;
    }

    public void setConfig(Configurations config) {
        this.config = config;
    }

    public void getPrice(){
      //System.out.println("Price of mobile phone is"+nokia.getPrice());
      config.getSpeedOfPhone();

  }


}
