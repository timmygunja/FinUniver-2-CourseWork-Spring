package com.example.timmygunja.service;


import com.example.timmygunja.entity.Order;
import com.example.timmygunja.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void save(Order order) {
        orderRepository.save(order);
    }

    public void delete(Order order) { orderRepository.delete(order);}

    public List<Order> findAll() { return orderRepository.findAll(); }

    public Order find(Long id) {
        return orderRepository.findById(id).get();
    }
}
