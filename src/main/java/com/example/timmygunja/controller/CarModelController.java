package com.example.timmygunja.controller;


import com.example.timmygunja.entity.CarModel;
import com.example.timmygunja.service.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarModelController {
    private final CarModelService carModelService;

    @Autowired
    public CarModelController(CarModelService employeeService) {
        this.carModelService = employeeService;
    }

    @PostMapping(value = "/car-models")
    public ResponseEntity<?> create(@RequestBody CarModel carModel) {
        carModelService.create(carModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/car-models")
    public ResponseEntity<List<CarModel>> findAll() {
        final List<CarModel> carModelList = carModelService.findAll();

        return carModelList != null && !carModelList.isEmpty()
                ? new ResponseEntity<>(carModelList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/car-models/{id}")
    public ResponseEntity<CarModel> find(@PathVariable(name = "id") Long id) {
        final CarModel carModel = carModelService.find(id);

        return carModel != null
                ? new ResponseEntity<>(carModel, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
