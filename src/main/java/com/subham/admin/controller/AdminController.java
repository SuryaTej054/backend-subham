package com.subham.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subham.admin.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:2606")
public class AdminController {
	@Autowired
	private AdminService adminServ;
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		boolean success = adminServ.login(username, password);
		return success ? "Login successful" : "Invalid credentials";
	}

}
