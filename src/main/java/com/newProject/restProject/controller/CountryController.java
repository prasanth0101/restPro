package com.newProject.restProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newProject.restProject.entity.Country;
import com.newProject.restProject.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@PostMapping(value = "/register")
	public String  insertCountry(@RequestBody Country country) {
			return countryService.put(country);
			
	}
	
	@GetMapping(value = "/getall")
	public List<Country> getAll() {
		return countryService.getall();
	}
	
}
