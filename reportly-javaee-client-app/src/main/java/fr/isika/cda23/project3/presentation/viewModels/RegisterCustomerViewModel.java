package fr.isika.cda23.project3.presentation.viewModels;


import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.PersonalDetails;


public class RegisterCustomerViewModel {
	
	private CompanyDetails companyDetails;
	private PersonalDetails personalDetails;


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

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterCustomerViewModel [companyDetails=");
		builder.append(companyDetails);
		builder.append(", personalDetails=");
		builder.append(personalDetails);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
