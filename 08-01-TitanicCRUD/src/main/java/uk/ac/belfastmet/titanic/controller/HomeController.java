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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	public HomeController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "The Titanic");
		return "homePage"; //displays homePage
	
	}
	
	@GetMapping("/passenger")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByOrderByName());
		return "passengersPage"; //displays passengersPage
	
	} 
	
	
	@GetMapping("/view/{passengerid}")
	public String viewPassenger(@PathVariable("passengerid") Integer passengerid, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passengers", passengerRepository.findOne(passengerid));
		return "viewPassengerPage"; //displays viewPassengerPage
	
	} 
	
	@GetMapping("/edit/{passengerid}") //edits a record
	public String editPassenger(@PathVariable("passengerid") Integer passengerid, Model model) {
		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("pageHeading", "Edit Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerid));
		return "editPassengerPage";
	}
	
	@GetMapping("/add") //adds a new record
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
//			return "editPassengerPage";
//		}
//		
//		else{
			savedPassenger.getPassengerid();
		
		return "redirect:/view/" + savedPassenger.getPassengerid();	
//		}
	}
	
	@GetMapping("/delete/{passengerid}") //deletes a record
	public String deleteCereal(@PathVariable("passengerid") Integer passengerid, RedirectAttributes redirectAttrs) {
		passengerRepository.delete(passengerid);
		redirectAttrs.addFlashAttribute("message", "Entry Deleted Successfully");
		return "redirect:/passenger";
	}

	
}




