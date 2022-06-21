package com.example.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Component1 implements MyInterface{
    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName() + " (Component1)");
    }
}
