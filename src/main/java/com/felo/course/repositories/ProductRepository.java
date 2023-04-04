package com.felo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
