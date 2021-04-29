package com.example.timmygunja.service;


import com.example.timmygunja.entity.Privilege;
import com.example.timmygunja.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService {
    @Autowired
    private PrivilegeRepository privilegeRepository;

    public void save(Privilege privilege) {
        privilegeRepository.save(privilege);
    }

    public void delete(Privilege privilege) { privilegeRepository.delete(privilege);}

    public List<Privilege> findAll() {
        return privilegeRepository.findAll();
    }

    public Privilege find(Long id) {
        return privilegeRepository.findById(id).get();
    }
}
