package com.example.timmygunja.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private String image;

    @ManyToOne
    @JoinColumn(name="CARMODEL_ID")
    private CarModel carModel;


    public Car(String plateNumber, String description, String image, CarModel carModel) {
        this.plateNumber = plateNumber;
        this.description = description;
        this.image = image;
        this.carModel = carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) &&
                Objects.equals(plateNumber, car.plateNumber) &&
                Objects.equals(description, car.description) &&
                Objects.equals(image, car.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plateNumber, description, image, carModel);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", plateNumber='" + plateNumber + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
