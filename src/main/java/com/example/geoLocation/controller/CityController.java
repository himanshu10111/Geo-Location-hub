package com.example.geoLocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geoLocation.model.CityModel;
import com.example.geoLocation.repository.CityReposity;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*") 
public class CityController {
	
	@Autowired
	CityReposity cityService;
	
	

	@GetMapping("/all")
	public List<CityModel> getAllCity()
	{
		return cityService.getAllCity();
	}
	
	@GetMapping("{state_id}")
	public List<CityModel> getAllCityByStateId(@PathVariable("state_id")  long state_id)
	{
		return cityService.getAllCityBySateId(state_id);
	}
}
