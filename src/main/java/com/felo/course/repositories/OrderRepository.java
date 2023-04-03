package com.felo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
