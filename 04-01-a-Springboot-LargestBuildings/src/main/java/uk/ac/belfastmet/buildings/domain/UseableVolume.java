package uk.ac.belfastmet.buildings.domain;

public class UseableVolume extends FloorArea {
		private String volume;
	
	public UseableVolume(String name, String country, String city, String volume, String image) {
		super(name, country, city, volume, image);
		// TODO Auto-generated constructor stub
		this.volume = volume;
	}
	
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

}



