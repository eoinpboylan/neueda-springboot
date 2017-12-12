package uk.ac.belfastmet.cereal.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Cereal {
	


	@Id
	@GeneratedValue
	private String manufacturer;
	private String name;
	private Double energy;
	private Double calories;
	private Double protein;
	private Double carbohydrates;
	private Double sugars;
	private Double fat;
	private Double saturates;
	private Double fibre;
	private String sodium;
	private String salt;
	private Double iron;
	
	public Cereal() {
		super();
	}
	
	public Cereal(String manufacturer, String name, Double energy, Double calories, Double protein,
			Double carbohydrates, Double sugars, Double fat, Double saturates, Double fibre, String sodium, String salt,
			Double iron) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getEnergy() {
		return energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getSaturates() {
		return saturates;
	}

	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}

	public Double getFibre() {
		return fibre;
	}

	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}

	public String getSodium() {
		return sodium;
	}

	public void setSodium(String sodium) {
		this.sodium = sodium;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}
	

}
