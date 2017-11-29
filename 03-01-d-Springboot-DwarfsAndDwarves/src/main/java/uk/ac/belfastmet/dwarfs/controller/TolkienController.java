/*package uk.ac.belfastmet.dwarfs.controller;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Controller
@RequestMapping("/")

public class TolkienController {
	
	@GetMapping("/")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");	//changes the title of the disneyPage
		model.addAttribute("dwarves", getDwarfs()); //adds the getDwarfs() function as an attribute in the table on disneyPage, displays an ArrayList of dwarfs
		return "tolkienPage"; //displays tolkienPage
	
	}
	
	public ArrayList<Dwarf> getDwarfs(){
		//function will return an array of dwarves using a constructor
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		//these are the tolkien dwarfs
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
		dwarfs.add(thorin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		dwarfs.add(balin);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		dwarfs.add(dwalin);
		Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
		dwarfs.add(fili);
		Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
		dwarfs.add(kili);
		Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		dwarfs.add(dori);
		Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		dwarfs.add(nori);
		Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		dwarfs.add(ori);
		Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
		dwarfs.add(oin);
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
		dwarfs.add(gloin);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		dwarfs.add(bifur);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		dwarfs.add(bofur);
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
		dwarfs.add(bombur);
		
			return dwarfs;	
		
		
	}
	
	}
	*/

