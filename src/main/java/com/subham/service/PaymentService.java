package com.subham.service;

import com.subham.entity.Payment;

public interface PaymentService {
	Payment makePayment(Payment paymentRequest);
	Payment getPaymentById(Long id);
}
