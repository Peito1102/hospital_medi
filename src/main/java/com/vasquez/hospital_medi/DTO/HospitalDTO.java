package com.vasquez.hospital_medi.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class HospitalDTO {
    
    @NotBlank(message = "El nombre no puede estar vacío")
    public String name;
    @NotBlank(message = "La edad no puede estar vacío")
    public String age;
    @NotBlank(message = "El area no puede estar vacío")
    public String area;
    @NotNull(message = "No debe ser nulo o vacio")
    public Long sede_id;
    @NotNull(message = "No debe ser nulo o vacio")
    public Long condition_id;
    @NotNull(message = "No debe ser nulo o vacio")
    public Long manager_id;

}
