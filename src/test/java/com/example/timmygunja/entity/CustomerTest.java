package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void customerCreateTest() {
        Customer customer = new Customer();
        Assert.assertNotNull(customer);
    }

    @Test
    public void customerEditTest() {
        Customer customer = new Customer();
        List<Car> carList = new List<Car>() {
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
            public Iterator<Car> iterator() {
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
            public boolean add(Car car) {
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
            public boolean addAll(Collection<? extends Car> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Car> c) {
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
            public Car get(int index) {
                return null;
            }

            @Override
            public Car set(int index, Car element) {
                return null;
            }

            @Override
            public void add(int index, Car element) {

            }

            @Override
            public Car remove(int index) {
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
            public ListIterator<Car> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Car> listIterator(int index) {
                return null;
            }

            @Override
            public List<Car> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        customer.setName("some name");
        customer.setSurname("some surname");
        customer.setContact("some contact");
        customer.setCarList(carList);

        Assert.assertNotNull(customer);
        Assert.assertEquals("some name", customer.getName());
        Assert.assertEquals("some surname", customer.getSurname());
        Assert.assertEquals("some contact", customer.getContact());
        Assert.assertNotNull(customer.getCarList());
    }

}