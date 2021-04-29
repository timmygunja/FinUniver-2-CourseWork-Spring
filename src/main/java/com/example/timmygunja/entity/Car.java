package com.example.timmygunja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


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

    @OneToOne
    private CarModel carModel;

    @ManyToOne
    private Customer customer;
}
