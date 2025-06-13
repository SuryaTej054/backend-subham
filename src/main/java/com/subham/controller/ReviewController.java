package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.Review;
import com.subham.service.ReviewService;

@RestController
@CrossOrigin(origins = "http://localhost:2606")
@RequestMapping("/api/reviews")
public class ReviewController {
	@Autowired
	private ReviewService reviewServ;
	@PostMapping("/add")
	public Review addReview(@RequestBody Review review) {
		return reviewServ.addReview(review);
	}
	@GetMapping("/product/{productId}")
	public List<Review> getReviewByProductId(@PathVariable long productId){
		return reviewServ.getReviewByProductId(productId);
	}

}
