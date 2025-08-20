package com.vasquez.hospital_medi.services;

import java.util.List;

import com.vasquez.hospital_medi.entities.City;

public interface CityService {
    List<City> list_city();
    City create_city(City city);
}
