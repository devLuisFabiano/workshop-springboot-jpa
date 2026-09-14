package com.luisdev.course.services;

import com.luisdev.course.entities.Product;
import com.luisdev.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(long id){
        return repository.findById(id).get();
    }
}
