package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void carCreateTest() {
        Car car = new Car();
        Assert.assertNotNull(car);
    }

    @Test
    public void carEditTest() {
        Car car = new Car();
        CarModel carModel = new CarModel();
        Customer customer = new Customer();

        car.setDescription("some description");
        car.setPlateNumber("some plate number");
        car.setCarmodel(carModel);
        car.setCustomer(customer);

        Assert.assertNotNull(car);
        Assert.assertEquals("some description", car.getDescription());
        Assert.assertEquals("some plate number", car.getPlateNumber());
        Assert.assertNotNull(car.getCarmodel());
        Assert.assertNotNull(car.getCustomer());
    }
}