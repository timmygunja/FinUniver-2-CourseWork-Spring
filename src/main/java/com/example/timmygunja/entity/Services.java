package com.example.timmygunja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "SERVICES")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String cost;

    @OneToMany(mappedBy="services", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JsonBackReference(value = "order-services")
    private List<Order> orderList;
}
