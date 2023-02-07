package com.springtest.controller;

import com.springtest.SpringConfig;
import com.springtest.model.Animal.PetAnimals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalTestController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PetAnimals pet = (PetAnimals) context.getBean("petAnimals");
        pet.petAnimalDetails();
        System.out.println("Pet object===="+pet);
        PetAnimals pet1 = (PetAnimals) context.getBean("petAnimals");
        pet1.petAnimalDetails();
        System.out.println("Pet object1===="+pet1);
    }
}
