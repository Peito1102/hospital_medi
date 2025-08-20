package com.vasquez.hospital_medi.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.vasquez.hospital_medi.entities.District;

public interface DistrictRepository extends JpaRepository<District, Long> {

    /* @Query(value = "CALL list_district()", nativeQuery = true)
    List<District> list_district();
    
    @Query(value = "CALL create_district(:nombre)", nativeQuery = true)
    District create_district(
        @Param("nombre") String name
    ); */

}
