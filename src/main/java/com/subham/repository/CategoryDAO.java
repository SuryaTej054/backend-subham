package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Long>{

}
