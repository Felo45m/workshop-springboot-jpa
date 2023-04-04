package com.felo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
