package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{

}
