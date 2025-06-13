package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Long>{

}
