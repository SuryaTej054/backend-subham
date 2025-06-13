package com.subham.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.subham.entity.Cart;
@Service
public interface CartDAO extends JpaRepository<Cart, Long>{
	List<Cart> findByUserId(long userId);
	void deleteByUserIdAndProductId(long UserId, long ProductId);
}
