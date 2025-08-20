package com.vasquez.hospital_medi.services;

import java.util.List;

import com.vasquez.hospital_medi.DTO.SedeDTO;
import com.vasquez.hospital_medi.entities.Sede;

public interface SedeService {
    List<Sede> list_sedes();
    Sede create_sede(SedeDTO sedeDTO);
}
