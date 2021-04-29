package com.example.timmygunja.service;


import com.example.timmygunja.entity.Car;
import com.example.timmygunja.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public void save(Car car) {
        carRepository.save(car);
    }

    public void delete(Car car) { carRepository.delete(car);}

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car find(Long id) {
        return carRepository.findById(id).get();
    }
}
