package com.saugat.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
        Student student = context.getBean(Student.class);
        student.display();
    }

}
