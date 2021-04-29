package com.example.timmygunja.repository;

import com.example.timmygunja.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
