package com.vasquez.hospital_medi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasquez.hospital_medi.DTO.HospitalDTO;
import com.vasquez.hospital_medi.entities.Hospital;
import com.vasquez.hospital_medi.repositories.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    public HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> list_hospital() {
        return hospitalRepository.list_hospital();
    }

    @Override
    public Hospital create_hospital(HospitalDTO hospitalDTO) {
        return hospitalRepository.create_hospital(hospitalDTO.name, hospitalDTO.age, hospitalDTO.area, hospitalDTO.sede_id, hospitalDTO.condition_id, hospitalDTO.manager_id);
    }

    @Override
    public Hospital update_hospital(Long id, HospitalDTO hospitalDTO) {
        return hospitalRepository.update_hospital(id, hospitalDTO.name, hospitalDTO.age, hospitalDTO.area, hospitalDTO.sede_id, hospitalDTO.condition_id, hospitalDTO.manager_id);
    }

    @Override
    public void delete_hospital(Long id) {
        hospitalRepository.delete_hospital(id);
    }

}
