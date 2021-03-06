package com.example.timmygunja.controller;


import com.example.timmygunja.entity.CarModel;
import com.example.timmygunja.service.CarBrandService;
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
    private final CarBrandService carBrandService;

    @Autowired
    public CarModelController(CarModelService employeeService, CarBrandService carBrandService) {
        this.carModelService = employeeService;
        this.carBrandService = carBrandService;
    }

    @PostMapping(value = "/car-models")
    public ResponseEntity<?> create(@RequestBody CarModel carModel) {
        carModelService.save(carModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/car-models")
    public ResponseEntity<?> update(@RequestBody CarModel newCarModel) {
        CarModel carModel = carModelService.find(newCarModel.getId());
        carModel.setName(newCarModel.getName());
        carModel.setDescription(newCarModel.getDescription());
        carModel.setCarbrand(newCarModel.getCarbrand());
        carModelService.save(carModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/car-models/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        CarModel carModel = carModelService.find(id);
        carModelService.delete(carModel);
        return new ResponseEntity<>(HttpStatus.OK);
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
