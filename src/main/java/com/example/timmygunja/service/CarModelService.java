package com.example.timmygunja.service;


import com.example.timmygunja.entity.CarModel;
import com.example.timmygunja.repository.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {
    @Autowired
    private CarModelRepository carModelRepository;

    public void create(CarModel carModel) {
        carModelRepository.save(carModel);
    }

    public List<CarModel> findAll() {
        return carModelRepository.findAll();
    }

    public CarModel find(Long id) {
        return carModelRepository.findById(id).get();
    }
}
