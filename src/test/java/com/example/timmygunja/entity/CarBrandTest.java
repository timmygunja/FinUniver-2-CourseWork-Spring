package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CarBrandTest {

    @Test
    public void carBrandCreateTest() {
        CarBrand carBrand = new CarBrand();
        Assert.assertNotNull(carBrand);
    }

    @Test
    public void carBrandEditTest() {
        CarBrand carBrand = new CarBrand();
        List<CarModel> carModelList = new List<CarModel>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<CarModel> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(CarModel carModel) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends CarModel> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends CarModel> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public CarModel get(int index) {
                return null;
            }

            @Override
            public CarModel set(int index, CarModel element) {
                return null;
            }

            @Override
            public void add(int index, CarModel element) {

            }

            @Override
            public CarModel remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<CarModel> listIterator() {
                return null;
            }

            @Override
            public ListIterator<CarModel> listIterator(int index) {
                return null;
            }

            @Override
            public List<CarModel> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        carBrand.setName("some name");
        carBrand.setDescription("some description");
        carBrand.setImage("some image");
        carBrand.setCarModelList(carModelList);

        Assert.assertNotNull(carBrand);
        Assert.assertEquals("some name", carBrand.getName());
        Assert.assertEquals("some description", carBrand.getDescription());
        Assert.assertEquals("some image", carBrand.getImage());
        Assert.assertNotNull(carBrand.getCarModelList());
    }

}