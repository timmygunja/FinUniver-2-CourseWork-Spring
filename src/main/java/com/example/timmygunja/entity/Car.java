package com.example.timmygunja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plateNumber;
    private String description;

    @ManyToOne
    private CarModel carmodel;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy="car", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JsonBackReference(value = "order-car")
    private List<Order> orderList;
}
