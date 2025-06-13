package com.subham.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.entity.Payment;
import com.subham.repository.PaymentDAO;

@Service
public class PaymentServiceImple implements PaymentService{
	@Autowired
	private PaymentDAO paymentRepo;
	
	@Override
	public Payment getPaymentById(Long id) {
		return paymentRepo.findById(id).orElse(null);
	}
	@Override
	public Payment makePayment(Payment paymentRequest) {
		paymentRequest.setPaymentStatus("SUCCESS");
		paymentRequest.setTxnId(UUID.randomUUID().toString());
		paymentRequest.setPaidAt(LocalDateTime.now());
		return paymentRepo.save(paymentRequest);
	}
}
