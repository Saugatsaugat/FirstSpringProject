package com.saugat.firstspringproject.repository;

import com.saugat.firstspringproject.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public void save(Product p){
        System.out.println("Product Added");
    }
}
