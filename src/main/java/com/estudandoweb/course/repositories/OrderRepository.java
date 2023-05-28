package com.estudandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
