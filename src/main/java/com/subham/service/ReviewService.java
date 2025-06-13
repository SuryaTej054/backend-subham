package com.subham.service;

import java.util.List;

import com.subham.entity.Review;

public interface ReviewService {
	
	Review addReview(Review review);
	List<Review> getReviewByProductId(long productId);

}
