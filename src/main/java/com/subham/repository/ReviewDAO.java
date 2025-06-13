package com.subham.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.Review;

public interface ReviewDAO extends JpaRepository<Review, Long>{
	List<Review> findByProductId(Long productId);
}
