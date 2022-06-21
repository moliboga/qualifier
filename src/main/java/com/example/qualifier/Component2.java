package com.example.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("component2")
public class Component2 implements MyInterface{
    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName() + " (Component2)");
    }
}
