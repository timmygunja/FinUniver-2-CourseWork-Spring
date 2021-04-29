package com.example.timmygunja.service;


import com.example.timmygunja.entity.Position;
import com.example.timmygunja.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    public void save(Position position) {
        positionRepository.save(position);
    }

    public void delete(Position position) { positionRepository.delete(position);}

    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    public Position find(Long id) {
        return positionRepository.findById(id).get();
    }
}
