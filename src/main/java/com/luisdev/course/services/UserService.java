package com.luisdev.course.services;

import com.luisdev.course.entities.User;
import com.luisdev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(long id){
        return repository.findById(id).get();
    }
}
