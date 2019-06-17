package com.tamim.dao;

import java.util.List;
import com.tamim.entity.Country;


public interface CountryDao {
	
	public List<Country> getCountries();
	
	public void saveCountry(Country theCountry);
	
	public Country getCountry(int theId);
	
	public void deleteCountry(int theId);
}
