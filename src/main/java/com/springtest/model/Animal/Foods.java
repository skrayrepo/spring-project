package com.springtest.model.Animal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("foods")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Foods {
    public void petFood(){
        System.out.println("Foods for Pet Animals");
    }
}
