package com.example.timmygunja.service;


import com.example.timmygunja.entity.Employee;
import com.example.timmygunja.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(Employee employee) { employeeRepository.delete(employee);}

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee find(Long id) {
        return employeeRepository.findById(id).get();
    }
}
