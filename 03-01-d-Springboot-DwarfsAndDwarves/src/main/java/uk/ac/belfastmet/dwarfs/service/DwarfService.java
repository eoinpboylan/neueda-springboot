package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
@Service
public class DwarfService {
	
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarves;
	
	public DwarfService() {
		super();
	}

	//will get dwarfs outside of main controller
	public ArrayList<Dwarf> getDisneyDwarfs(){
		//function will return an array of dwarfs using a constructor
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		//these are the Disney dwarfs
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		
		
			return dwarfs;	
		
		
	}
	
	public ArrayList<Dwarf> getTolkienDwarves(){
			//function will return an array of dwarves using a constructor
			ArrayList<Dwarf> dwarves = new ArrayList<Dwarf>();
			//these are the tolkien dwarfs
			Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
			dwarves.add(thorin);
			Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
			dwarves.add(balin);
			Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
			dwarves.add(dwalin);
			Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
			dwarves.add(fili);
			Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
			dwarves.add(kili);
			Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
			dwarves.add(dori);
			Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
			dwarves.add(nori);
			Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
			dwarves.add(ori);
			Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
			dwarves.add(oin);
			Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
			dwarves.add(gloin);
			Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
			dwarves.add(bifur);
			Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
			dwarves.add(bofur);
			Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
			dwarves.add(bombur);
			
			return dwarves;
		
	}
}
