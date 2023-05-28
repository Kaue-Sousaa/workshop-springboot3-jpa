package com.estudandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
