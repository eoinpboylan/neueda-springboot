package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue
	private Integer paymentId;
	private String beneficiaryName;
	private String dateOfApplication;
	private String installedLocation;
	private String techType;
	private Integer capacity;
	private Double paymentsMade;
	
	public Payment() {
		super();
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getInstalledLocation() {
		return installedLocation;
	}

	public void setInstalledLocation(String installedLocation) {
		this.installedLocation = installedLocation;
	}

	public String getTechType() {
		return techType;
	}

	public void setTechType(String techType) {
		this.techType = techType;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getPaymentsMade() {
		return paymentsMade;
	}

	public void setPaymentsMade(Double paymentsMade) {
		this.paymentsMade = paymentsMade;
	}
	
	
}