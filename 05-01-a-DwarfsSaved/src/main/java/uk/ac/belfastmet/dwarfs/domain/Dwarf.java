package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dwarf {
	
	@Id
	@GeneratedValue
	private Integer dwarfId;
	private String name;
	private String author;
	private String image;
	
	
	public Dwarf() {
		super();
	}
	
	public Dwarf(String dName, String dAuthor, String dImage){
		
		name = dName;
		author = dAuthor;
		image = dImage;
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}