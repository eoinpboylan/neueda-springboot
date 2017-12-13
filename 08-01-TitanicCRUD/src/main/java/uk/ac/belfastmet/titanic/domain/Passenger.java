package uk.ac.belfastmet.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private Integer passengerid;
	private Integer survived;
	private Integer pclass;
	private String name;
	private String sex;
	private Double age;
	private Integer sibSp;
	private Integer parch;
	private String ticket;
	private Double fare;
	private String cabin;
	private String embarked;
	

	public Passenger() {
		super();
	}


	public Integer getPassengerid() {
		return passengerid;
	}


	public void setPassengerid(Integer passengerid) {
		this.passengerid = passengerid;
	}


	public Integer getSurvived() {
		return survived;
	}


	public void setSurvived(Integer survived) {
		this.survived = survived;
	}


	public Integer getPclass() {
		return pclass;
	}


	public void setPclass(Integer pclass) {
		this.pclass = pclass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Double getAge() {
		return age;
	}


	public void setAge(Double age) {
		this.age = age;
	}


	public Integer getSibSp() {
		return sibSp;
	}


	public void setSibSp(Integer sibSp) {
		this.sibSp = sibSp;
	}


	public Integer getParch() {
		return parch;
	}


	public void setParch(Integer parch) {
		this.parch = parch;
	}


	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public Double getFare() {
		return fare;
	}


	public void setFare(Double fare) {
		this.fare = fare;
	}


	public String getCabin() {
		return cabin;
	}


	public void setCabin(String cabin) {
		this.cabin = cabin;
	}


	public String getEmbarked() {
		return embarked;
	}


	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}




}
