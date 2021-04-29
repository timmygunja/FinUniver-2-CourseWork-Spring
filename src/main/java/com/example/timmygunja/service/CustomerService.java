package com.example.timmygunja.service;


import com.example.timmygunja.entity.Customer;
import com.example.timmygunja.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(Customer customer) { customerRepository.delete(customer);}

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer find(Long id) { return customerRepository.findById(id).get(); }
}
