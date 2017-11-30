package uk.ac.belfastmet.buildings.domain;

public class Footprint extends FloorArea {
	private String footprint;
	
	public Footprint(String name, String country, String city, String footprint, String image) {
		super(name, country, city, footprint, image);
		// TODO Auto-generated constructor stub
			this.footprint = footprint;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	

	
	
	
	

}
