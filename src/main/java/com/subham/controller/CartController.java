package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.Cart;
import com.subham.repository.CartDAO;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:2606")
public class CartController {
	@Autowired
	private CartDAO cartRepo;
	@PostMapping("/add")
	public Cart addToCart(@RequestBody Cart cart) {
		return cartRepo.save(cart);
	}
	@GetMapping("/{userId}")
	public List<Cart> getByUserId(@PathVariable long userId){
		return cartRepo.findByUserId(userId);
	}
	@DeleteMapping("/remove")
	@Transactional
	public String removeFromCart(@RequestParam long userId, @RequestParam long productId) {
		cartRepo.deleteByUserIdAndProductId(userId, productId);
		return "Item removed from cart";
	}

}
