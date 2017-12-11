package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/survivedPage")
public class SurvivedController {

	@Autowired
	PassengerRepository passengerRepository;
	
	public SurvivedController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


	
	@GetMapping("/")
	public String survived(Model model) {
		model.addAttribute("pageTitle", "Survivors");
		
		model.addAttribute("passengers", passengerRepository.findBySurvivedOrderByName(1));
		return "survivedPage"; //displays survivedPage
	
	} 
	
	
	
}

