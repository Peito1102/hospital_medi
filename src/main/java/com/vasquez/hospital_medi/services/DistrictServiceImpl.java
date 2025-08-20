package com.vasquez.hospital_medi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasquez.hospital_medi.DTO.DistrictDTO;
import com.vasquez.hospital_medi.entities.City;
import com.vasquez.hospital_medi.entities.District;
import com.vasquez.hospital_medi.repositories.DistrictRepository;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public List<District> list_district() {
        return districtRepository.findAll();
    }

    @Override
    public District create_district(DistrictDTO districtDTO) {
        District district = new District();
        district.setName(districtDTO.name);
        City city = new City();
        city.setId(districtDTO.city_id);
        district.setCity(city);
        return districtRepository.save(district);
    }

}
