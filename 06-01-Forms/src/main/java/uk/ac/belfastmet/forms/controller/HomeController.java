package uk.ac.belfastmet.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Form Example");
		return "formPage";
	}

	@PostMapping("/results")
	public String results(Model model, @RequestParam("firstname") String firstName, 
			@RequestParam("lastname") String lastName, 
			@RequestParam("gender") String gender) {
		
		model.addAttribute("pageTitle", "Results");
		model.addAttribute("firstname", firstName);
		model.addAttribute("lastname", lastName);
		model.addAttribute("gender", gender);
		return "resultPage";
	}
	
	@GetMapping("/results")
	public String getresults(Model model) {
		
		model.addAttribute("pageTitle", "Results");
		model.addAttribute("firstname", "Chuck");
		model.addAttribute("lastname", "Norris");
		model.addAttribute("gender", "All of them");
		return "resultPage";
	}


}
