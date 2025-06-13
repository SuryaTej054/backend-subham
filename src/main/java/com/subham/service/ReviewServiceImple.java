package com.subham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.entity.Review;
import com.subham.repository.ReviewDAO;
@Service
public class ReviewServiceImple implements ReviewService{
	@Autowired
	private ReviewDAO reviewRepo;

	@Override
	public Review addReview(Review review) {
		return reviewRepo.save(review);
	}

	@Override
	public List<Review> getReviewByProductId(long productId) {
		return reviewRepo.findByProductId(productId);
	}
	

}
