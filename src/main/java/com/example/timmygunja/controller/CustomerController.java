package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Customer;
import com.example.timmygunja.entity.Employee;
import com.example.timmygunja.service.CustomerService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@JsonAutoDetect
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value = "/customers")
    public ResponseEntity<?> create(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping(value = "/customers")
    public ResponseEntity<?> update(@RequestBody Customer newCustomer) {
        Customer customer = customerService.find(newCustomer.getId());
        customer.setName(newCustomer.getName());
        customer.setSurname(newCustomer.getSurname());
        customer.setContact(newCustomer.getContact());
        customer.setCarList(newCustomer.getCarList());
        customerService.save(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Customer customer = customerService.find(id);
        customerService.delete(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> findAll() {
        final List<Customer> customerList = customerService.findAll();

        return customerList != null && !customerList.isEmpty()
                ? new ResponseEntity<>(customerList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> find(@PathVariable(name = "id") Long id) {
        final Customer customer = customerService.find(id);

        return customer != null
                ? new ResponseEntity<>(customer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
