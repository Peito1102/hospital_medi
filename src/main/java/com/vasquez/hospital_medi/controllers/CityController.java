package com.vasquez.hospital_medi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasquez.hospital_medi.entities.City;
import com.vasquez.hospital_medi.services.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping("/list")
    public List<City> list_city() {
        return cityService.list_city();
    }
    
    @PostMapping("/create")
    public City create_city(@RequestBody City city) {
        return cityService.create_city(city);
    }
    

}
