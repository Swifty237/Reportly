package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class CompanyDetailsViewModel {
	
	
	private Date CreationDate = new Date();
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
}
