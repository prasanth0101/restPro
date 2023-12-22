package com.newProject.restProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newProject.restProject.entity.Country;
import com.newProject.restProject.repo.CountryRepo;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private Country country;
	
	public String put(Country country) {
		
		countryRepo.save(country);
		
		return "Inserted sucessfully!";
		
	}

	public List<Country> getall() {
		return countryRepo.findAll();
		
	}

	
	
}
