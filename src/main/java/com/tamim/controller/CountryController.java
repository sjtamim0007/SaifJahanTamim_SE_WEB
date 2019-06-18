package com.tamim.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tamim.entity.Country;
import com.tamim.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	// need to inject country service
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/list")
	public String listCountries(Model theModel) {
		
		// get countries from the service
		List<Country> theCountries = countryService.getCountries();
				
		// add the countries to the model
		theModel.addAttribute("countries", theCountries);
		
		return "list-countries";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Country theCountry = new Country();
		
		theModel.addAttribute("country", theCountry);
		
		return "country-form";
	}
	
	@PostMapping("/saveCountry")
	public String saveCustomer(@Valid@ModelAttribute("country") Country theCountry,BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "country-form";
		}
		
		// save the country using our service
		countryService.saveCountry(theCountry);	
		
		return "redirect:/country/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("countryId") int theId,
									Model theModel) {
		
		// get the country from our service
		Country theCountry = countryService.getCountry(theId);	
		
		// set country as a model attribute to pre-populate the form
		theModel.addAttribute("country", theCountry);
		
		// send over to our form		
		return "country-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("countryId") int theId) {
		
		// delete the country
		countryService.deleteCountry(theId);
		
		return "redirect:/country/list";
	}
}
