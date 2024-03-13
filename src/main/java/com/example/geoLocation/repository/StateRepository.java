package com.example.geoLocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.geoLocation.entities.states;
import com.example.geoLocation.model.StateModel;

@Repository
public interface StateRepository extends JpaRepository<states,Long>{
	
	@Query(value = "SELECT * FROM states",nativeQuery = true)
	List<StateModel> getAllStates();
	
	@Query(value = "SELECT * FROM states where country_id =:country_id",nativeQuery = true)
	List<StateModel> getAllStatesByCountryId(@Param("country_id") Long countryId);
	

}
