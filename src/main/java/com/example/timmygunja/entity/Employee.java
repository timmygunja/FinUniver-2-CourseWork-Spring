package com.example.timmygunja.entity;

import com.example.timmygunja.service.PositionService;
import com.example.timmygunja.service.PrivilegeService;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Objects;


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

    @OneToOne()
    private Position position;

    @OneToOne()
    private Privilege privilege;

        public Employee(String name, String surname, String contact, String login,
                    String password, Position position, Privilege privilege) {
        this.name = name;
        this.surname = surname;
        this.contact = contact;
        this.login = login;
        this.password = password;
        this.position = position;
        this.privilege = privilege;
    }

//    @JsonProperty("position_id")
//    private void unpackNested(String position_id) {
//        this.position = new Position();
//        position.setId(Long.parseLong(position_id));
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
                '}';
    }
}
