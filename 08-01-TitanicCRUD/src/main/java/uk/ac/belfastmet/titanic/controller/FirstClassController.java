package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/firstClassPage")
public class FirstClassController {

	@Autowired
	PassengerRepository passengerRepository;
	
	public FirstClassController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


	
	@GetMapping("/")
	public String first(Model model) {
		model.addAttribute("pageTitle", "First Class Passengers");
		
		model.addAttribute("passengers", passengerRepository.findByPclassOrderByName(1));
		return "firstClassPage"; //displays firstClassPage
	
	} 
	
	
	
}

