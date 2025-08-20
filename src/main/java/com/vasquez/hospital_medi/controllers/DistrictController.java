package com.vasquez.hospital_medi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasquez.hospital_medi.entities.District;
import com.vasquez.hospital_medi.services.DistrictService;

@RestController
@RequestMapping("/api/district")
public class DistrictController {

    @Autowired
    DistrictService districtService;

    @GetMapping("/list")
    public List<District> list_district() {
        return districtService.list_district();
    }
    
    @PostMapping("/create")
    public District create_district(@RequestBody District district) {
        return districtService.create_district(district);
    }

}
