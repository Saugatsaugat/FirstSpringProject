package com.saugat.firstspringproject;

import com.saugat.firstspringproject.model.Product;
import com.saugat.firstspringproject.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class FirstSpringProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
//        Student student = context.getBean(Student.class);
//        student.display();
//
//        LaptopService service = context.getBean(LaptopService.class);
//        service.laptopPerformance();

        Product p = context.getBean(Product.class);
        p.setId(4);
        p.setName("Soda");
        p.setGroupName("Drinks");

        ProductService ps = context.getBean(ProductService.class);
        ps.saveData(p);

        List<Product> productList = ps.getAll();
        productList.forEach(x->{
            System.out.println("Id: "+x.getId());
            System.out.println("Name: "+x.getName());
            System.out.println("GroupName: "+x.getGroupName());
            System.out.println("\n");
        });
    }

}
