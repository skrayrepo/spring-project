package com.springtest.controller;

import com.springtest.SpringConfig;
import com.springtest.model.vehicle.Car;
import com.springtest.model.vehicle.MyVehicle;
import com.springtest.model.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyInjectionTestController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MyVehicle vehicle = context.getBean(MyVehicle.class);
        vehicle.getVehicleDetails();
    }
}
