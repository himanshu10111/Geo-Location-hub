package com.example.geoLocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.geoLocation.entities.countryEntity;
import com.example.geoLocation.model.CountryModel;

public interface CountryRepository extends JpaRepository<countryEntity, Long> {
	
	@Query(value = "SELECT * FROM countries",nativeQuery = true)
	List<CountryModel> getAllCity();
	
	
	

}
