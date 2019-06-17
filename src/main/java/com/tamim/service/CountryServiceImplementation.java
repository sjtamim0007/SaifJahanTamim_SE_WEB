package com.tamim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tamim.dao.CountryDao;
import com.tamim.entity.Country;

@Service
public class CountryServiceImplementation implements CountryService {

	// Inject the CountryDao object
	@Autowired
	private CountryDao countryDao;

	@Override
	@Transactional
	public List<Country> getCountries() {

		return countryDao.getCountries();
	}

	@Override
	@Transactional
	public void saveCountry(Country theCountry) {

		countryDao.saveCountry(theCountry);

	}

	@Override
	@Transactional
	public Country getCountry(int theId) {

		return countryDao.getCountry(theId);
	}

	@Override
	@Transactional
	public void deleteCountry(int theId) {

		countryDao.deleteCountry(theId);

	}

}
