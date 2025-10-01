package com.vasquez.hospital_medi.services;

import org.springframework.data.jpa.domain.Specification;

import com.vasquez.hospital_medi.entities.Hospital;

public class HospitalSpecifications {
    public static Specification<Hospital> contieneEnCampo(String campo, String valor) {
        return (root, query, cb) -> cb.like(
            cb.lower(root.get(campo)),   // columna dinámica (campo elegido)
            "%" + valor.toLowerCase() + "%"  // patrón con LIKE
        );
    }
}
