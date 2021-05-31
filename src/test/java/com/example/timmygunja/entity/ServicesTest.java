package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class ServicesTest {

    @Test
    public void servicesCreateTest() {
        Services services = new Services();
        Assert.assertNotNull(services);
    }

    @Test
    public void servicesEditTest() {
        Services services = new Services();
        List<Order> orderList = new List<Order>() {
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
            public Iterator<Order> iterator() {
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
            public boolean add(Order order) {
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
            public boolean addAll(Collection<? extends Order> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Order> c) {
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
            public Order get(int index) {
                return null;
            }

            @Override
            public Order set(int index, Order element) {
                return null;
            }

            @Override
            public void add(int index, Order element) {

            }

            @Override
            public Order remove(int index) {
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
            public ListIterator<Order> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Order> listIterator(int index) {
                return null;
            }

            @Override
            public List<Order> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        services.setName("some name");
        services.setDescription("some description");
        services.setCost("some cost");
        services.setOrderList(orderList);

        Assert.assertNotNull(services);
        Assert.assertEquals("some name", services.getName());
        Assert.assertEquals("some description", services.getDescription());
        Assert.assertNotNull("some cost", services.getCost());
        Assert.assertNotNull(services.getOrderList());
    }

}