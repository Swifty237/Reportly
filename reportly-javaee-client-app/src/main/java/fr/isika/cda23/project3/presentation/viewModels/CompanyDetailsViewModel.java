package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.common.AdressDetails;

public class CompanyDetailsViewModel {
	
	private Date creationDate = new Date();
	private String brand;
	private String email;
	private AdressDetails adressDetails;
	
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public AdressDetails getAdressDetails() {
		return adressDetails;
	}

	public void setAdressDetails(AdressDetails adressDetails) {
		this.adressDetails = adressDetails;
	}
}
