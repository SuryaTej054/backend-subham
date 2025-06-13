package com.subham.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.entity.Order;
import com.subham.repository.OrderDAO;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderDAO orderRepo;

    public Order placeOrder(Order order) {
        order.setOrderDate(new Date());
        order.setStatus("PLACED");
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepo.findById(id);
    }

    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}

