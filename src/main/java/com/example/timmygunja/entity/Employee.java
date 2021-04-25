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

//public Employee(String name, String surname, String contact, String login,
//            String password, Position position, Privilege privilege) {
//        this.name = name;
//        this.surname = surname;
//        this.contact = contact;
//        this.login = login;
//        this.password = password;
//        this.position = position;
//        this.privilege = privilege;
//    }


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
    }

    public Position getPosition() { return position; }

    public void setPosition(Position position) { this.position = position; }

    public Privilege getPrivilege() { return privilege; }

    public void setPrivilege(Privilege privilege) { this.privilege = privilege; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + surname + '\'' +
                ", password='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", privilege='" + privilege + '\'' +
                '}';
    }
}
