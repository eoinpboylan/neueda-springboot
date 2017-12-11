package uk.ac.belfastmet.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private Integer passengerID;
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


	public Passenger(int passengerID, int survived, int pClass, String name, String sex, double age, int sibSp, int parch,
			String ticket, double fare, String cabin, String embarked) {
		super();
		this.passengerID = passengerID;
		this.survived = survived;
		this.pclass = pClass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sibSp = sibSp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.cabin = cabin;
		this.embarked = embarked;
	}


	public int getPassengerID() {
		return passengerID;
	}


	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}


	public int getSurvived() {
		return survived;
	}


	public void setSurvived(int survived) {
		this.survived = survived;
	}


	public int getPclass() {
		return pclass;
	}


	public void setPclass(int pClass) {
		this.pclass = pClass;
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


	public double getAge() {
		return age;
	}


	public void setAge(double age) {
		this.age = age;
	}


	public int getSibSp() {
		return sibSp;
	}


	public void setSibSp(int sibSp) {
		this.sibSp = sibSp;
	}


	public int getParch() {
		return parch;
	}


	public void setParch(int parch) {
		this.parch = parch;
	}


	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public double getFare() {
		return fare;
	}


	public void setFare(double fare) {
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
