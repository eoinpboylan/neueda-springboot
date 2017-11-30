package uk.ac.belfastmet.buildings.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.domain.FloorArea;
import uk.ac.belfastmet.buildings.service.BuildingService;

@org.springframework.stereotype.Controller
@RequestMapping("/")

public class Controller {
	
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "home"; //displays home.html
	
	}
	
	@GetMapping("/largestFloorArea")
	//displays floor area array
	public String area(Model model) {
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getBuildingsByArea()); 
		
		return "largestFloorArea"; //displays largestFloorArea page
	
	} 
	
	@GetMapping("/largestFootprint")
	//displays footprint array
	public String footprint(Model model) {
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getBuildingsByFootprint()); 
		
		return "largestFloorArea"; //displays largestFootprint page
	
	} 
	

	
	

	

	
}
