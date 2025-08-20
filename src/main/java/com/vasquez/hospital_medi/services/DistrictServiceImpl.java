package com.vasquez.hospital_medi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasquez.hospital_medi.entities.District;
import com.vasquez.hospital_medi.repositories.DistrictRepository;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public List<District> list_district() {
        return districtRepository.list_district();
    }

    @Override
    public District create_district(District district) {
        return districtRepository.create_district(district.getName());
    }

}
