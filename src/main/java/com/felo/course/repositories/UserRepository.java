package com.felo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
