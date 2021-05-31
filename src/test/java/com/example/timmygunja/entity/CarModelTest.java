package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarModelTest {

    @Test
    public void carModelCreateTest() {
        CarModel carModel = new CarModel();
        Assert.assertNotNull(carModel);
    }

    @Test
    public void carModelEditTest() {
        CarModel carModel = new CarModel();
        CarBrand carBrand = new CarBrand();

        carModel.setName("some name");
        carModel.setDescription("some description");
        carModel.setCarbrand(carBrand);

        Assert.assertNotNull(carModel);
        Assert.assertEquals("some name", carModel.getName());
        Assert.assertEquals("some description", carModel.getDescription());
        Assert.assertNotNull(carModel.getCarbrand());
    }

}