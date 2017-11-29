package uk.ac.belfastmet.dwarfs.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping("/")

public class DisneyController {
	
	@Autowired
	private DwarfService dwarfService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage"; //displays disneyPage
	
	}
	
	@GetMapping("/disneyPage")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");	//changes the title of the disneyPage
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", this.dwarfService.getDisneyDwarfs()); //adds the getDwarfs() function as an attribute in the table on disneyPage, displays an ArrayList of dwarfs
		
		return "disneyPage"; //displays disneyPage
	
	} 
	
	@GetMapping("/tolkienPage")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");	//changes the title of the tolkienPage
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarves", this.dwarfService.getTolkienDwarves()); //adds the getDwarves() function as an attribute in the table on tolkienPage, displays an ArrayList of dwarves
		return "tolkienPage"; //displays tolkienPage
	
	}
	

	

	
}
