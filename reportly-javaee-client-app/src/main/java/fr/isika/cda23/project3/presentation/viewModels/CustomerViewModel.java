package fr.isika.cda23.project3.presentation.viewModels;

import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.PersonalDetails;

public class CustomerViewModel {

	private Long id;
	
	private CompanyDetails companyDetails;
	private AdressDetails adressDetails;
	private PersonalDetails personalDetails;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public AdressDetails getAdressDetails() {
		return adressDetails;
	}

	public void setAdressDetails(AdressDetails adressDetails) {
		this.adressDetails = adressDetails;
	}	
}