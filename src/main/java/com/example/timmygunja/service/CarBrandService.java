package com.example.timmygunja.service;


import com.example.timmygunja.entity.CarBrand;
import com.example.timmygunja.repository.CarBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandService {
    @Autowired
    private CarBrandRepository carBrandRepositoryRepository;

    public void create(CarBrand carBrand) {
        carBrandRepositoryRepository.save(carBrand);
    }

    public List<CarBrand> findAll() {
        return carBrandRepositoryRepository.findAll();
    }

    public CarBrand find(Long id) {
        return carBrandRepositoryRepository.findById(id).get();
    }
}
