package com.vasquez.hospital_medi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasquez.hospital_medi.entities.City;
import com.vasquez.hospital_medi.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> list_city() {
        return cityRepository.list_city();
    }

    @Override
    public City create_city(City city) {
        return cityRepository.create_city(city.getName());
    }

}
