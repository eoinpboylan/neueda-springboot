package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


	
	@GetMapping("")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByOrderByName());
		return "passengersPage"; //displays passengersPage
	
	} 
	
	
	@GetMapping("passenger/view/{passengerid}/")
	public String viewPassenger(@PathVariable("passengerID") Integer passengerID, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passengers", passengerRepository.findOne(passengerID));
		return "viewPassengerPage"; //displays viewPassengerPage
	
	} 
	
	@GetMapping("/add/") //adds a new record
	public String addPassenger( Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("pageHeading", "Add Passenger");
		
		model.addAttribute("passenger", new Passenger());
		return "editPassengerPage"; //displays editPassengerPage to add new record
	
	} 
	

	
	
	@PostMapping("/save") //saves to database, then redirects to view the new record
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		
		Passenger savedPassenger = passengerRepository.save(passenger);
//		
//		if(bindingResult.hasErrors()) {
//			
//			return "editCereal";
//		}
//		
//		else{
			savedPassenger.getPassengerid();
		
		return "redirect:/view/" + savedPassenger.getPassengerid();	
//		}
	}

	
}
