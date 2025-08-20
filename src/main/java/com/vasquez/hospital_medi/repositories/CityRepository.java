package com.vasquez.hospital_medi.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.vasquez.hospital_medi.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{
   /*  @Query(value = "CALL list_city()", nativeQuery = true)
    List<City> list_city();
    
    @Query(value = "CALL create_city(:nombre)", nativeQuery = true)
    City create_city(
        @Param("nombre") String name
    ); */

}
