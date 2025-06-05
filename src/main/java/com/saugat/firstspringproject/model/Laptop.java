package com.saugat.firstspringproject.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void compile(){
        System.out.println("This is Laptop Class");
    }
}
