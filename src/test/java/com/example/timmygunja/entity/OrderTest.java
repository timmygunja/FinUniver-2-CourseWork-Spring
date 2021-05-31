package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void orderCreateTest() {
        Order order = new Order();
        Assert.assertNotNull(order);
    }

    @Test
    public void orderEditTest() {
        Order order = new Order();
        Services services = new Services();
        Employee employee = new Employee();
        Car car = new Car();

        order.setIsDone("done");
        order.setServices(services);
        order.setEmployee(employee);
        order.setCar(car);

        Assert.assertNotNull(car);
        Assert.assertEquals("done", order.getIsDone());
        Assert.assertNotNull(order.getServices());
        Assert.assertNotNull(order.getEmployee());
        Assert.assertNotNull(order.getCar());
    }

}