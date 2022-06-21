package com.example.qualifier;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Manager2 implements InitializingBean {
    @Autowired
    @Qualifier("component2")
    private MyInterface myInterface;

    @Override
    public void afterPropertiesSet() throws Exception {
        myInterface.printClassName();
    }
}
