package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.User;


public interface UserDAO extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
