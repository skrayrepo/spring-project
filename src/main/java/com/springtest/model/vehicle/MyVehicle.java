package com.springtest.model.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyVehicle {
    @Autowired
    Vehicle vehicle;

    public void getVehicleDetails(){
        vehicle.engineCapacity();
        vehicle.getPrice();
    }
}
