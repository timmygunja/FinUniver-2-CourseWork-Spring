package com.example.timmygunja.controller;


import com.example.timmygunja.entity.Privilege;
import com.example.timmygunja.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PrivilegeController {
    private final PrivilegeService privilegeService;

    @Autowired
    public PrivilegeController(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @PostMapping(value = "/privileges")
    public ResponseEntity<?> create(@RequestBody Privilege privilege) {
        privilegeService.create(privilege);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/privileges")
    public ResponseEntity<List<Privilege>> findAll() {
        final List<Privilege> privilegeList = privilegeService.findAll();

        return privilegeList != null && !privilegeList.isEmpty()
                ? new ResponseEntity<>(privilegeList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/privileges/{id}")
    public ResponseEntity<Privilege> find(@PathVariable(name = "id") Long id) {
        final Privilege privilege = privilegeService.find(id);

        return privilege != null
                ? new ResponseEntity<>(privilege, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
