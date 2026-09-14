package com.luisdev.course.services;

import com.luisdev.course.entities.Category;
import com.luisdev.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(long id){
        return repository.findById(id).get();
    }
}
