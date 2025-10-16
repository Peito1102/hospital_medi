package com.vasquez.hospital_medi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasquez.hospital_medi.entities.UserMedi;

public interface UserRepository extends JpaRepository<UserMedi, Long>{

    boolean existsByUsername(String username);
    Optional<UserMedi> findByUsername(String username);

}
