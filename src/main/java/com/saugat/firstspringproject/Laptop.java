package com.saugat.firstspringproject;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void compile(){
        System.out.println("This is Laptop Class");
    }
}
