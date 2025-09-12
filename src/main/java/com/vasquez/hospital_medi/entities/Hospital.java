package com.vasquez.hospital_medi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @Column(length = 50, nullable = false)
    @NotBlank(message = "La edad no puede estar vacío")
    private String age;

    @Column(length = 50, nullable = false)
    @NotBlank(message = "El area no puede estar vacío")
    private String area;

    private LocalDateTime date_registration;

    @ManyToOne
    @JoinColumn(name = "sede_id",
                foreignKey = @ForeignKey(name= "fk_hospital_sede"))
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "condition_id",
                foreignKey = @ForeignKey(name= "fk_hospital_condition"))
    private Condition condition;

    @OneToOne
    @JoinColumn(name = "manager_id",
                foreignKey = @ForeignKey(name= "fk_hospital_manager"))
    private Manager manager;

    @PrePersist
    protected void onCreate() {
        this.date_registration = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDateTime getDate_registration() {
        return date_registration;
    }

    public void setDate_registration(LocalDateTime date_registration) {
        this.date_registration = date_registration;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


}
