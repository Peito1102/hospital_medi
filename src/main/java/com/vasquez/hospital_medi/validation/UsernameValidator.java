package com.vasquez.hospital_medi.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.vasquez.hospital_medi.repositories.UserRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true; 
        }

        return !userRepository.existsByUsername(value);
    }

}
