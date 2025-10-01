package com.vasquez.hospital_medi.services;

import java.util.List;

import com.vasquez.hospital_medi.DTO.HospitalDTO;
import com.vasquez.hospital_medi.entities.Hospital;

public interface HospitalService {

    public List<Hospital> list_hospital();
    
    public Hospital create_hospital(HospitalDTO hospitalDTO);

    public Hospital update_hospital(Long id, HospitalDTO hospitalDTO);

    public void delete_hospital(Long id);

    public Hospital findById(Long id);

    public List<Hospital> buscar(String campo, String valor);
    
}
