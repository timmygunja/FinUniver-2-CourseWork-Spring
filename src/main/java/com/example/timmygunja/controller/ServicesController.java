package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Services;
import com.example.timmygunja.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ServicesController {
    private final ServicesService servicesService;

    @Autowired
    public ServicesController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @PostMapping(value = "/services")
    public ResponseEntity<?> create(@RequestBody Services services) {
        servicesService.save(services);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/services")
    public ResponseEntity<?> update(@RequestBody Services newServices) {
        Services services = servicesService.find(newServices.getId());
        services.setName(newServices.getName());
        services.setDescription(newServices.getDescription());
        services.setCost(newServices.getCost());
        servicesService.save(services);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/services/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Services services = servicesService.find(id);
        servicesService.delete(services);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/services")
    public ResponseEntity<List<Services>> findAll() {
        final List<Services> servicesList = servicesService.findAll();

        return servicesList != null && !servicesList.isEmpty()
                ? new ResponseEntity<>(servicesList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/services/{id}")
    public ResponseEntity<Services> find(@PathVariable(name = "id") Long id) {
        final Services services = servicesService.find(id);

        return services != null
                ? new ResponseEntity<>(services, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
