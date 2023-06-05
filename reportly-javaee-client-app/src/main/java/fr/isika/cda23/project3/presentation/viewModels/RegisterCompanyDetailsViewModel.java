package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class RegisterCompanyDetailsViewModel {

	private Date creationDate;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterCompanyDetailsViewModel [creationDate=");
		builder.append(creationDate);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	
}
