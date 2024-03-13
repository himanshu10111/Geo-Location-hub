package com.example.geoLocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geoLocation.model.CountryModel;
import com.example.geoLocation.model.StateModel;
import com.example.geoLocation.repository.StateRepository;

@RestController
@RequestMapping("states")
public class StatesController {

	@Autowired
	StateRepository stateRepository;
	
	
	@GetMapping("/all")
	 List<StateModel> getAllSates()
	{
		return stateRepository.getAllStates();
	}
	
	
	@GetMapping("/{countryId}")
	List<StateModel> getAllStatesByCountryId(@PathVariable("countryId") Long countryId)
	{
		return stateRepository.getAllStatesByCountryId(countryId);
	}
	
	
	
}
