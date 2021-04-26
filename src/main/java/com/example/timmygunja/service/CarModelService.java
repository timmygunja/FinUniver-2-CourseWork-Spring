package com.example.timmygunja.service;


import com.example.timmygunja.entity.CarBrand;
import com.example.timmygunja.entity.CarModel;
import com.example.timmygunja.entity.Position;
import com.example.timmygunja.repository.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {
    @Autowired
    private CarModelRepository carModelRepository;

    public void save(CarModel carModel) {
        carModelRepository.save(carModel);
    }

    public void delete(CarModel carModel) { carModelRepository.delete(carModel);}

    public List<CarModel> findAll() {
        return carModelRepository.findAll();
    }

    public CarModel find(Long id) {
        return carModelRepository.findById(id).get();
    }
}
