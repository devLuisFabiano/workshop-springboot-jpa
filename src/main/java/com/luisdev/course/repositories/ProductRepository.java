package com.luisdev.course.repositories;

import com.luisdev.course.entities.Category;
import com.luisdev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
