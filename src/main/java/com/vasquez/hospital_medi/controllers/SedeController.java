package com.vasquez.hospital_medi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasquez.hospital_medi.DTO.SedeDTO;
import com.vasquez.hospital_medi.entities.Sede;
import com.vasquez.hospital_medi.services.SedeService;

@RestController
@RequestMapping("/api/sede")
public class SedeController {

    @Autowired
    SedeService sedeService;

    @GetMapping("/list")
    public List<Sede> list_sede() {
        return sedeService.list_sedes();
    }
    
    @PostMapping("/create")
    public Sede create_sede(@RequestBody SedeDTO sedeDTO) {
        return sedeService.create_sede(sedeDTO);
    }
}
