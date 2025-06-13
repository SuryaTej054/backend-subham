package com.subham.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.admin.entity.AdminEntity;
import com.subham.admin.repository.AdminDAO;


@Service
public class AdminServiceImple implements AdminService{
	@Autowired
	private AdminDAO adminRepo;

	@Override
	public boolean login(String username, String password) {
		AdminEntity admin = adminRepo.findByUsernameAndPassword(username, password);
		return admin != null;
	}

	
	

}
