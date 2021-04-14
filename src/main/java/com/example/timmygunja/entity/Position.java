package com.example.timmygunja.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
@Table(name = "POSITION")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String salary;

    @OneToOne
    @JoinColumn(name="EMPLOYEE_ID")
    private Employee employee;


    public Position(String name, String description, String salary, Employee employee) {
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(id, position.id) &&
                Objects.equals(name, position.name) &&
                Objects.equals(description, position.description) &&
                Objects.equals(salary, position.salary) &&
                Objects.equals(employee, position.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, salary, employee);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", salary='" + salary + '\'' +
                ", employee='" + employee + '\'' +
                '}';
    }
}
