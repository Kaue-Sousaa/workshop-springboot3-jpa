package com.estudandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoweb.course.entities.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem, Long>{
	
}
