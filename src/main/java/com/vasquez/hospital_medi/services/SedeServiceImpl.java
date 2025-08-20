package com.vasquez.hospital_medi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasquez.hospital_medi.DTO.SedeDTO;
import com.vasquez.hospital_medi.entities.District;
import com.vasquez.hospital_medi.entities.Sede;
import com.vasquez.hospital_medi.repositories.SedeRepository;

@Service
public class SedeServiceImpl implements SedeService {

    @Autowired
    SedeRepository sedeRepository;

    @Override
    public List<Sede> list_sedes() {
        return sedeRepository.findAll();
    }

    @Override
    public Sede create_sede(SedeDTO sedeDTO) {
        Sede sede = new Sede();
        sede.setName(sedeDTO.name);
        District district = new District();
        district.setId(sedeDTO.district_id);
        sede.setDistrict(district);
        return sedeRepository.save(sede);
    }

}
