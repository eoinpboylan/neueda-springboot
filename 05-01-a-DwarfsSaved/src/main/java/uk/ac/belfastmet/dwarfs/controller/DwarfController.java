package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Controller
@RequestMapping("/")

public class DwarfController {
	
	@Autowired
	DwarfRepository dwarfRepository;
	
	public DwarfController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Dwarfs vs Dwarves");
		return "homePage"; //displays disneyPage
	
	}
	
	@GetMapping("/disneyPage")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("dwarfs", dwarfRepository.findTop3ByAuthorOrderByName("Disney"));
		return "disneyPage"; //displays disneyPage
	
	} 
	
	@GetMapping("/tolkienPage")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthorOrderByName("Tolkien"));
		return "tolkienPage"; //displays tolkienPage
	
	}	
}
