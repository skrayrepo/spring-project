package com.springtest.model.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("petAnimals")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PetAnimals {
    Foods foods;

    @Autowired
    PetAnimals(Foods foods){
        //System.out.println("PetAnimal Constructor created.....");
        this.foods = foods;
        System.out.println("Foods object is"+this.foods);
    }

    public void petAnimalDetails(){
        foods.petFood();
    }
}
