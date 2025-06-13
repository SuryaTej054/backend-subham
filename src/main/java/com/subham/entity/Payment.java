package com.subham.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long orderId;
	private double amount;
	private String paymentMode; // card, upi, cod
	private String paymentStatus; //success, failure
	private String txnId;
	private LocalDateTime paidAt;
	
	public Payment() {
		
	}
	public Payment(long orderId, double amount, String paymentMode, String paymentStatus, String txnId,
			LocalDateTime paidAt) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.txnId = txnId;
		this.paidAt = paidAt;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public LocalDateTime getPaidAt() {
		return paidAt;
	}
	public void setPaidAt(LocalDateTime paidAt) {
		this.paidAt = paidAt;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", orderId=" + orderId + ", amount=" + amount + ", paymentMode=" + paymentMode
				+ ", paymentStatus=" + paymentStatus + ", txnId=" + txnId + ", paidAt=" + paidAt + "]";
	}

}
