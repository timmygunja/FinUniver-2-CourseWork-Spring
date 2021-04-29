package com.example.timmygunja.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String contact;
    private String login;
    private String password;

    @ManyToOne
    public Position position;

    @ManyToOne
    public Privilege privilege;

    @OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JsonBackReference(value = "order-employee")
    private List<Order> orderList;
}
