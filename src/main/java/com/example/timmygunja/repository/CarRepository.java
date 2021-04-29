package com.example.timmygunja.repository;

import com.example.timmygunja.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
