package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Position;
import com.example.timmygunja.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PositionController {
    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping(value = "/positions")
    public ResponseEntity<?> create(@RequestBody Position position) {
        positionService.create(position);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/positions")
    public ResponseEntity<List<Position>> findAll() {
        final List<Position> positionList = positionService.findAll();

        return positionList != null && !positionList.isEmpty()
                ? new ResponseEntity<>(positionList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/positions/{id}")
    public ResponseEntity<Position> find(@PathVariable(name = "id") Long id) {
        final Position position = positionService.find(id);

        return position != null
                ? new ResponseEntity<>(position, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
