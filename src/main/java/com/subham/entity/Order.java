package com.subham.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long userId;
	private double totalAmount;
	private Date orderDate;
	private String status;
	
	 @ElementCollection
	 private List<Long> productIds;
	
	public Order() {
		
	}
	public Order(long userId, double totalAmount, Date orderDate, String status) {
		super();
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
	

}
