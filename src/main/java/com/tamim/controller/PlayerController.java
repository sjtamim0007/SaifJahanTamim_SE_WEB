package com.tamim.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tamim.entity.Player;
import com.tamim.service.PlayerService;

@Controller
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/savePlayer")
	public String savePlayer(@Valid@ModelAttribute("player") Player thePlayer,BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "player-form";
		}
		
		// save the country using our service
		playerService.savePlayer(thePlayer);	
		
		return "success";
	}
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Player thePlayer = new Player();
		
		theModel.addAttribute("player", thePlayer);
		
		return "player-form";
	}
}
