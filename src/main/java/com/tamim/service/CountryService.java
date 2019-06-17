package com.tamim.service;

import java.util.List;

import com.tamim.entity.Country;

public interface CountryService {
	
	public List<Country> getCountries();

	public void saveCountry(Country theCountry);

	public Country getCountry(int theId);

	public void deleteCountry(int theId);
}
