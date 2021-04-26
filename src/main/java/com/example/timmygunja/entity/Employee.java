package com.example.timmygunja.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


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
//    @JoinColumn(name="position_id", referencedColumnName = "id")
//    @JsonBackReference(value = "employee-position")
    public Position position;


    @ManyToOne
//    @JoinColumn(name="privilege_id", referencedColumnName = "id")
//    @JsonBackReference(value = "employee-privilege")
    public Privilege privilege;
}
