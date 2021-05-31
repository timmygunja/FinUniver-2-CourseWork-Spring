package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void employeeCreateTest() {
        Employee employee = new Employee();
        Assert.assertNotNull(employee);
    }

    @Test
    public void employeeEditTest() {
        Employee employee = new Employee();
        Position position = new Position();
        Privilege privilege = new Privilege();

        employee.setName("some name");
        employee.setSurname("some surname");
        employee.setLogin("some login");
        employee.setPassword("some password");
        employee.setContact("some contact");
        employee.setPosition(position);
        employee.setPrivilege(privilege);

        Assert.assertNotNull(employee);
        Assert.assertEquals("some name", employee.getName());
        Assert.assertEquals("some surname", employee.getSurname());
        Assert.assertEquals("some login", employee.getLogin());
        Assert.assertEquals("some password", employee.getPassword());
        Assert.assertEquals("some contact", employee.getContact());
        Assert.assertNotNull(employee.getPosition());
        Assert.assertNotNull(employee.getPrivilege());
    }

}