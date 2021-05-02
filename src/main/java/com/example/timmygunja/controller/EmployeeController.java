package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Employee;
import com.example.timmygunja.service.EmployeeService;
import com.example.timmygunja.service.PositionService;
import com.example.timmygunja.service.PrivilegeService;
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
public class EmployeeController {
    private final EmployeeService employeeService;
    private final PositionService positionService;
    private final PrivilegeService privilegeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService,
                              PositionService positionService,
                              PrivilegeService privilegeService) {
        this.employeeService = employeeService;
        this.positionService = positionService;
        this.privilegeService = privilegeService;
    }

    @PostMapping(value = "/employees")
    public ResponseEntity<?> create(@RequestBody Employee employee) {
        employeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping(value = "/employees")
    public ResponseEntity<?> update(@RequestBody Employee newEmployee) {
        Employee employee = employeeService.find(newEmployee.getId());
        employee.setName(newEmployee.getName());
        employee.setSurname(newEmployee.getSurname());
        employee.setContact(newEmployee.getContact());
        employee.setLogin(newEmployee.getLogin());
        employee.setPassword(newEmployee.getPassword());
        employee.setPosition(newEmployee.getPosition());
        employee.setPrivilege(newEmployee.getPrivilege());
        employeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/employees/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Employee employee = employeeService.find(id);
        employeeService.delete(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<List<Employee>> findAll() {
        final List<Employee> employeeList = employeeService.findAll();

        return employeeList != null && !employeeList.isEmpty()
                ? new ResponseEntity<>(employeeList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity<Employee> find(@PathVariable(name = "id") Long id) {
        final Employee employee = employeeService.find(id);

        return employee != null
                ? new ResponseEntity<>(employee, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
