package uk.ac.belfastmet.buildings.domain;

public class FloorArea {
	private String name;
	private String floor;
	private String footprint;
	private String area;
	private String image;
	private String country;
	private String city;
	private String volume;
	


	public FloorArea(String name, String country, String city, String floor, String image) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.floor = floor;
		this.image = image;
		
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
