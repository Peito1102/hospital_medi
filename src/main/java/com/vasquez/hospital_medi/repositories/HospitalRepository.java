package com.vasquez.hospital_medi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vasquez.hospital_medi.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{

    @Query(value = "CALL SP_HOSPITAL_LISTAR()", nativeQuery = true)
    List<Hospital> list_hospital();

    @Query(value = "CALL SP_HOSPITAL_REGISTRAR(:nameh, :ageh, :areah, :sede_idh, :condition_idh, :manager_idh)", nativeQuery = true)
    Hospital create_hospital(
        @Param("nameh") String name,
        @Param("ageh") String age,
        @Param("areah") String area,
        @Param("sede_idh") Long sede_id,
        @Param("condition_idh") Long condition_id,
        @Param("manager_idh") Long manager_id
    );

    @Query(value = "CALL SP_HOSPITAL_ACTUALIZAR(:idh, :nameh, :ageh, :areah, :sede_idh, :condition_idh, :manager_idh)", nativeQuery = true)
    Hospital update_hospital(
        @Param("idh") Long id,
        @Param("nameh") String name,
        @Param("ageh") String age,
        @Param("areah") String area,
        @Param("sede_idh") Long sede_id,
        @Param("condition_idh") Long condition_id,
        @Param("manager_idh") Long manager_id
    );

    @Query(value = "CALL SP_HOSPITAL_ELIMINAR(:idh)", nativeQuery = true)
    void delete_hospital(@Param("idh") Long id);

}
