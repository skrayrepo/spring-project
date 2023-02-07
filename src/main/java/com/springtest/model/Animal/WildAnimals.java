package com.springtest.model.Animal;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Lazy annotation is used to create object when it required or called but never created at the time of spring container start
@Component
@Lazy
public class WildAnimals {
    WildAnimals(){
        System.out.println("WildAnimals Constructor created.....");
    }
}
