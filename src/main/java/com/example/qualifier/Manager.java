package com.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Manager {
    @Autowired
//    wires to Component1 bean by name
//    if @Primary annotation is present, would connect to primary bean despite name
    private MyInterface component1;

    @PostConstruct
    public void postConstruct(){
        component1.printClassName();
    }
}
