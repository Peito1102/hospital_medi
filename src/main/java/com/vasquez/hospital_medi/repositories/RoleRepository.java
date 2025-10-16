package com.vasquez.hospital_medi.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.vasquez.hospital_medi.entities.Role;


public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(String name);
}