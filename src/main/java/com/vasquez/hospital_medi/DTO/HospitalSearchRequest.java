package com.vasquez.hospital_medi.DTO;

import jakarta.validation.constraints.NotBlank;

public class HospitalSearchRequest {
    
    @NotBlank
    public String campo;
    public String valor;
    public String getCampo() {
        return campo;
    }
    public void setCampo(String campo) {
        this.campo = campo;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    
}
