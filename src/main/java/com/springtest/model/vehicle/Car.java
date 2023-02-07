package com.springtest.model.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

   /* @Autowired
    private Hyundai hyundai;*/    //Field Injection

    private Hyundai hyundai;

    @Autowired
    Car(Hyundai hyundai){        //Constructor Injection
        this.hyundai = hyundai;
    }

    /*@Autowired
    public void setHyundai(Hyundai hyundai) {          //Setter Injection
        this.hyundai = hyundai;
    }*/

    @Override
    public void getPrice() {
        System.out.println("Price of the "+hyundai.getCarModel()+" Car is 10 Lakhs");
    }

    @Override
    public void engineCapacity() {
        System.out.println("Capacity of the Car Engine");
    }
}
