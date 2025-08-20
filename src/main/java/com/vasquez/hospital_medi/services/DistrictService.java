package com.vasquez.hospital_medi.services;

import java.util.List;

import com.vasquez.hospital_medi.DTO.DistrictDTO;
import com.vasquez.hospital_medi.entities.District;

public interface DistrictService {
    List<District> list_district();
    District create_district(DistrictDTO districtDTO);
}
