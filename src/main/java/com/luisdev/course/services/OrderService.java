package com.luisdev.course.services;

import com.luisdev.course.entities.Order;
import com.luisdev.course.entities.User;
import com.luisdev.course.repositories.OrderRepository;
import com.luisdev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(long id){
        return repository.findById(id).get();
    }
}
