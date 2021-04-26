package com.example.timmygunja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
@Table(name = "PRIVILEGE")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="privilege", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JsonBackReference(value = "employee-privilege")
    private List<Employee> employees;
}
