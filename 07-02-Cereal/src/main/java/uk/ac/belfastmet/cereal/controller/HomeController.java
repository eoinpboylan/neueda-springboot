package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.cereal.domain.Cereal;
import uk.ac.belfastmet.cereal.repositories.CerealRepository;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	CerealRepository cerealRepository;
	
	@GetMapping("/") //displays the home page
	public String home(Model model) { 
		model.addAttribute("pageTitle", "Breakfast Cereals");
		model.addAttribute("pageHeading", "Breakfast Cereals");
		model.addAttribute("cereal", cerealRepository.findByOrderByName() );
		return "homePage";
	}

	@GetMapping("/cereal") //shows a list of all data in SQL table on cerealPage
	public String cerealPage(Model model) {
		model.addAttribute("pageTitle", "Cereal List");
		model.addAttribute("pageHeading", "Cereal List");
		model.addAttribute("cereals", cerealRepository.findByOrderByCerealId() );
		return "cerealPage";
	}
	
	@GetMapping("/cereal/view/{cerealId}") //views a single entry with all nutritional info on viewCerealPage
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "viewCerealPage";
	}
	
	@GetMapping("cereal/add") //adds a new record
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("pageHeading", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCerealPage";
	}
	
	@PostMapping("cereal/save") //saves to database, then redirects to view the new record
	public String saveCereal(Cereal cereal) {
		Cereal savedCereal = cerealRepository.save(cereal);
		savedCereal.getCerealId();
		return "redirect:/cereal/view/" + savedCereal.getCerealId();
	}
	
}
	
	
