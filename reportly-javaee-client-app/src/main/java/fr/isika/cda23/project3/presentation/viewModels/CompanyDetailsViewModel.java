package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class CompanyDetailsViewModel {
	
	private Date creationDate = new Date();
	private String brand;
	private String email;
	
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
	
	
}
