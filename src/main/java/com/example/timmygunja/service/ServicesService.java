package com.example.timmygunja.service;


import com.example.timmygunja.entity.Services;
import com.example.timmygunja.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {
    @Autowired
    private ServicesRepository servicesRepository;

    public void save(Services services) {
        servicesRepository.save(services);
    }

    public void delete(Services services) { servicesRepository.delete(services);}

    public List<Services> findAll() {
        return servicesRepository.findAll();
    }

    public Services find(Long id) {
        return servicesRepository.findById(id).get();
    }
}
