package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/passengersPage")
public class PassengerController {

	@Autowired
	PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


	
	@GetMapping("/")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByOrderByName());
		return "passengersPage"; //displays passengersPage
	
	} 
	
}
