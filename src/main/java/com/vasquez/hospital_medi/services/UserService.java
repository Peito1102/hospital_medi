package com.vasquez.hospital_medi.services;

import java.util.List;

import com.vasquez.hospital_medi.DTO.UserRegister;
import com.vasquez.hospital_medi.entities.UserMedi;

public interface UserService {

    List<UserMedi> findAll();
    UserMedi save(UserRegister user);
    boolean existsByUsername(String username);
    
}