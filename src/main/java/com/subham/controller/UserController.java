package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.User;
import com.subham.repository.UserDAO;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:2606")
public class UserController {
	@Autowired
	private UserDAO userRepo;
	@GetMapping
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	@PostMapping
	public User registerUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	@PostMapping("/login")
	public String loginUser(@RequestBody User loginData) {
		User user = userRepo.findByEmail(loginData.getEmail());
		if (user != null && user.getPassword().equals(loginData.getPassword())) {
			return "Login Success";
		}else {
			return "Invalid Credentials";
		}
	}
	
	

}
