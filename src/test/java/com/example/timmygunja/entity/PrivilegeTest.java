package com.example.timmygunja.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrivilegeTest {

    @Test
    public void privilegeCreateTest() {
        Privilege privilege = new Privilege();
        Assert.assertNotNull(privilege);
    }

    @Test
    public void privilegeEditTest() {
        Privilege privilege = new Privilege();
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

        privilege.setName("some name");
        privilege.setEmployees(employeeList);

        Assert.assertNotNull(privilege);
        Assert.assertEquals("some name", privilege.getName());
        Assert.assertNotNull(privilege.getEmployees());
    }

}