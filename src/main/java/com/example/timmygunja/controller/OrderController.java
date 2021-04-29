package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Order;
import com.example.timmygunja.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value = "/orders")
    public ResponseEntity<?> create(@RequestBody Order order) {
        orderService.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/orders")
    public ResponseEntity<?> update(@RequestBody Order newOrder) {
        Order order = orderService.find(newOrder.getId());
        order.setIsDone(newOrder.getIsDone());
        order.setCar(newOrder.getCar());
        order.setEmployee(newOrder.getEmployee());
        order.setServices(newOrder.getServices());
        orderService.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/orders/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Order order = orderService.find(id);
        orderService.delete(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/orders")
    public ResponseEntity<List<Order>> findAll() {
        final List<Order> orderList = orderService.findAll();

        return orderList != null && !orderList.isEmpty()
                ? new ResponseEntity<>(orderList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/orders/{id}")
    public ResponseEntity<Order> find(@PathVariable(name = "id") Long id) {
        final Order order = orderService.find(id);

        return order != null
                ? new ResponseEntity<>(order, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
