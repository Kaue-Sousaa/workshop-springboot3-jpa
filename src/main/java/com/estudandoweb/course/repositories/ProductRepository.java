package com.estudandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
