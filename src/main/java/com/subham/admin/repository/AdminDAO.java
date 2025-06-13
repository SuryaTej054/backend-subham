package com.subham.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.admin.entity.AdminEntity;

public interface AdminDAO extends JpaRepository<AdminEntity, Long>{
	AdminEntity findByUsernameAndPassword(String username, String password);
}
