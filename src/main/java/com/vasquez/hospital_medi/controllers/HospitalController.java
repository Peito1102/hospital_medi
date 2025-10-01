package com.vasquez.hospital_medi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasquez.hospital_medi.DTO.HospitalDTO;
import com.vasquez.hospital_medi.entities.Hospital;
import com.vasquez.hospital_medi.services.HospitalService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/list")
    public ResponseEntity<List<Hospital>> list_hospital() {
        return ResponseEntity.ok(hospitalService.list_hospital());
    }
    
    @PostMapping("/create")
    public ResponseEntity<Hospital> create_hospital(@RequestBody HospitalDTO hospitalDTO) {
        
        return ResponseEntity.ok(hospitalService.create_hospital(hospitalDTO));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Hospital> putMethodName(@PathVariable Long id, @RequestBody HospitalDTO hospitalDTO) {
        
        return ResponseEntity.ok(hospitalService.update_hospital(id, hospitalDTO));
    }

    @DeleteMapping("delete/{id}")
    public void delete_hospital(@PathVariable Long id) {
        hospitalService.delete_hospital(id);
    }
    
    @PostMapping("/buscar")
    public List<Hospital> buscar(@RequestBody HospitalSearchRequest request) {
        return hospitalService.buscar(request.getCampo(), request.getValor());
    }

}
