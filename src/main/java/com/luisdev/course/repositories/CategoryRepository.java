package com.luisdev.course.repositories;

import com.luisdev.course.entities.Category;
import com.luisdev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
