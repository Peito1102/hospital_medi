package com.vasquez.hospital_medi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasquez.hospital_medi.entities.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long> {
    
}
