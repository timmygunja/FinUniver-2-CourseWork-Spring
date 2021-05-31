package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void positionCreateTest() {
        Position position = new Position();
        Assert.assertNotNull(position);
    }

    @Test
    public void positionEditTest() {
        Position position = new Position();
        List<Employee> employeeList = new List<Employee>() {
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
            public Iterator<Employee> iterator() {
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
            public boolean add(Employee employee) {
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
            public boolean addAll(Collection<? extends Employee> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Employee> c) {
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
            public Employee get(int index) {
                return null;
            }

            @Override
            public Employee set(int index, Employee element) {
                return null;
            }

            @Override
            public void add(int index, Employee element) {

            }

            @Override
            public Employee remove(int index) {
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
            public ListIterator<Employee> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Employee> listIterator(int index) {
                return null;
            }

            @Override
            public List<Employee> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        position.setName("some name");
        position.setDescription("some description");
        position.setSalary("some salary");
        position.setEmployees(employeeList);

        Assert.assertNotNull(position);
        Assert.assertEquals("some name", position.getName());
        Assert.assertEquals("some description", position.getDescription());
        Assert.assertEquals("some salary", position.getSalary());
        Assert.assertNotNull(position.getEmployees());
    }

}