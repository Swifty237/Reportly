package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class CompanyDetailsViewModel {
	
	
	private Date CreationDate;
	private String Brand;
	private String Email;
	
	
	public Date getCreationDate() {
		return CreationDate;
	}

	
	public String getBrand() {
		return Brand;
	}
	
	public String getEmail() {
		return Email;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddCompanyDetailsViewModel [CreationDate=");
		builder.append(CreationDate);
		builder.append(", Brand=");
		builder.append(Brand);
		builder.append(", Email=");
		builder.append(Email);
		builder.append("]");
		return builder.toString();
	}
	
	

}
