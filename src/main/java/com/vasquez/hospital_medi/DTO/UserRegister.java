package com.vasquez.hospital_medi.DTO;

import com.vasquez.hospital_medi.validation.ValidDni;
import com.vasquez.hospital_medi.validation.ValidPhone;
import com.vasquez.hospital_medi.validation.ValidUsername;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegister {

    @NotBlank(message = "no puede estar vacío")
    @Email(message = "El formato del email no es válido")
    @ValidUsername
    private String username;

    @NotBlank(message = "no puede estar vacío")
    @Size(min = 3, max = 50, message = "debe tener entre 3 y 50 caracteres")
    private String name;

    @NotBlank(message = "no puede estar vacío")
    @Size(min = 3, max = 50, message = "debe tener entre 3 y 50 caracteres")
    private String lastName;

    @NotBlank(message = "no puede estar vacío")
    @Size(min = 8, max = 8, message = "debe tener exactamente 8 caracteres")
    @ValidDni
    private String dni;

    @NotBlank(message = "no puede estar vacío")
    @Size(min = 9, max = 9, message = "debe tener exactamente 9 caracteres")
    @ValidPhone
    private String phone;

    @NotBlank(message = "no puede estar vacío")
    @Size(min = 6, message = "debe tener al menos 6 caracteres")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
