package com.saugat.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    Laptop laptop;

    public void display(){
        System.out.println("Student class is trying access Laptop class using Autowire...\n");
        laptop.display();
    }
}
