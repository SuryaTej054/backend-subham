package com.subham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.Payment;
import com.subham.service.PaymentService;

@RestController
@CrossOrigin(origins ="http://localhost:2606")
@RequestMapping("/api/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentServ;
	@PostMapping("/makePayment")
	public Payment makePayment(@RequestBody Payment paymentRequest) {
		return paymentServ.makePayment(paymentRequest);
	}
	@GetMapping("/getPayment/{id}")
	public Payment getPaymentById(@PathVariable long id) {
		return paymentServ.getPaymentById(id);
	}
}
