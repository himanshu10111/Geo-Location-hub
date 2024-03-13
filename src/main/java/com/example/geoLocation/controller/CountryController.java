package com.example.geoLocation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geoLocation.model.CountryModel;
import com.example.geoLocation.repository.CountryRepository;


@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryRepository countryRepo;
	
	
	
	@GetMapping("/all")
	List<CountryModel> getAllCity()
	{
		return countryRepo.getAllCity();
	}

}
