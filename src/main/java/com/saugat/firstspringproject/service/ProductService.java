package com.saugat.firstspringproject.service;

import com.saugat.firstspringproject.model.Product;
import com.saugat.firstspringproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public void saveData(Product p){
        repository.save(p);
    }

}
