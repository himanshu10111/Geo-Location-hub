package com.example.geoLocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.geoLocation.entities.cityEntity;
import com.example.geoLocation.model.CityModel;
import com.example.geoLocation.model.StateModel;


public interface CityReposity extends JpaRepository<cityEntity, Long>{
	
	@Query(value = "select * from cities;",nativeQuery = true)
	List<CityModel> getAllCity();
	
	@Query(value = "SELECT * FROM cities where state_id=:state_id",nativeQuery = true)
	List<CityModel> getAllCityBySateId(@Param("state_id") Long state_id);
	
}
