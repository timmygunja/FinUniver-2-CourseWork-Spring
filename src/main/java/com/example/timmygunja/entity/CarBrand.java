package com.example.timmygunja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.util.List;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@Table(name = "CARBRAND")
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String image;

    @OneToMany(mappedBy="carbrand", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JsonBackReference(value = "model-brand")
    private List<CarModel> carModelList;
}
