package com.cristian695.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian695.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
