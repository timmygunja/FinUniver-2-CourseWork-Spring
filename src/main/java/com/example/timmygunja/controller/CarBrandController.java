package com.example.timmygunja.controller;


import com.example.timmygunja.entity.CarBrand;
import com.example.timmygunja.service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarBrandController {
    private final CarBrandService carBrandService;

    @Autowired
    public CarBrandController(CarBrandService carBrandService) {
        this.carBrandService = carBrandService;
    }

    @PostMapping(value = "/car-brands")
    public ResponseEntity<?> create(@RequestBody CarBrand carBrand) {
        carBrandService.create(carBrand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/car-brands")
    public ResponseEntity<List<CarBrand>> findAll() {
        final List<CarBrand> carBrandList = carBrandService.findAll();

        return carBrandList != null && !carBrandList.isEmpty()
                ? new ResponseEntity<>(carBrandList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/car-brands/{id}")
    public ResponseEntity<CarBrand> find(@PathVariable(name = "id") Long id) {
        final CarBrand carBrand = carBrandService.find(id);

        return carBrand != null
                ? new ResponseEntity<>(carBrand, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
