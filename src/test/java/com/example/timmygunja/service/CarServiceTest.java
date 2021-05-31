package com.example.timmygunja.service;

import com.example.timmygunja.entity.Car;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CarServiceTest {
    @Autowired
    private CarService carService;

    @Test
    public void carDeleteTest() {

    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
        CarService carService = new CarService();

        Car car = new Car();
        Assert.assertNotNull(car);

        System.out.println(carService.find(car.getId()));
    }

    @Test
    public void findAll() {
    }

    @Test
    public void find() {
    }
}