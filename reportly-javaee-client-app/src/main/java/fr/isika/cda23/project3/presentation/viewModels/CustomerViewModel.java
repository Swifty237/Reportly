package fr.isika.cda23.project3.presentation.viewModels;

<<<<<<< HEAD
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.PersonalDetails;

=======
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
public class CustomerViewModel {

	private Long id;
	
<<<<<<< HEAD
	private CompanyDetails companyDetails;
	private PersonalDetails personalDetails;
=======
	private AdressDetailsViewModel adressDetailsVm = new AdressDetailsViewModel();
	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();
	private PersonalDetailsViewModel personalDetailsVm = new PersonalDetailsViewModel();
	
	public CustomerViewModel() {
		adressDetailsVm = new AdressDetailsViewModel();
		companyDetailsVm = new CompanyDetailsViewModel();
		personalDetailsVm = new PersonalDetailsViewModel();
	}
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
	
	public Long getId() {
		return id;
	}

<<<<<<< HEAD
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
=======
	public void setId(Long id) {
		this.id = id;
	}

	public AdressDetailsViewModel getAdressDetailsVm() {
		return adressDetailsVm;
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
	}

	public void setAdressDetailsVm(AdressDetailsViewModel adressDetailsVm) {
		this.adressDetailsVm = adressDetailsVm;
	}

	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

<<<<<<< HEAD
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}	
=======
	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}

	public PersonalDetailsViewModel getPersonalDetailsVm() {
		return personalDetailsVm;
	}

	public void setPersonalDetailsVm(PersonalDetailsViewModel personalDetailsVm) {
		this.personalDetailsVm = personalDetailsVm;
	}

	
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
}