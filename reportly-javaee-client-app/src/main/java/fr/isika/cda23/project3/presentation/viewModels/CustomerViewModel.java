package fr.isika.cda23.project3.presentation.viewModels;

public class CustomerViewModel {

	private Long id;
	
	private AdressDetailsViewModel adressDetailsVm = new AdressDetailsViewModel();
	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();
	private PersonalDetailsViewModel personalDetailsVm = new PersonalDetailsViewModel();
	
	public CustomerViewModel() {
		adressDetailsVm = new AdressDetailsViewModel();
		companyDetailsVm = new CompanyDetailsViewModel();
		personalDetailsVm = new PersonalDetailsViewModel();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AdressDetailsViewModel getAdressDetailsVm() {
		return adressDetailsVm;
	}

	public void setAdressDetailsVm(AdressDetailsViewModel adressDetailsVm) {
		this.adressDetailsVm = adressDetailsVm;
	}

	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}

	public PersonalDetailsViewModel getPersonalDetailsVm() {
		return personalDetailsVm;
	}

	public void setPersonalDetailsVm(PersonalDetailsViewModel personalDetailsVm) {
		this.personalDetailsVm = personalDetailsVm;
	}

	
}