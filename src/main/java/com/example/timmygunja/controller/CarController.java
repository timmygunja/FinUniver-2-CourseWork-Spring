package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Car;
import com.example.timmygunja.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(value = "/cars")
    public ResponseEntity<?> create(@RequestBody Car car) {
        carService.save(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/cars")
    public ResponseEntity<?> update(@RequestBody Car newCar) {
        Car car = carService.find(newCar.getId());
        car.setPlateNumber(newCar.getPlateNumber());
        car.setDescription(newCar.getDescription());
        car.setCustomer(newCar.getCustomer());
        car.setCarmodel(newCar.getCarmodel());
        carService.save(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/cars/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Car car = carService.find(id);
        carService.delete(car);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/cars")
    public ResponseEntity<List<Car>> findAll() {
        final List<Car> carList = carService.findAll();

        return carList != null && !carList.isEmpty()
                ? new ResponseEntity<>(carList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/cars/{id}")
    public ResponseEntity<Car> find(@PathVariable(name = "id") Long id) {
        final Car car = carService.find(id);

        return car != null
                ? new ResponseEntity<>(car, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
