package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subham.entity.Payment;

public interface PaymentDAO extends JpaRepository<Payment, Long>{

}
