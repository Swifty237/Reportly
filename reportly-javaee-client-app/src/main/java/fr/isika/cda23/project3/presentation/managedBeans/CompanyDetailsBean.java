package fr.isika.cda23.project3.presentation.managedBeans;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.AdressDetailsServices;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;

@ManagedBean
public class CompanyDetailsBean {
	
	@Inject
	private AdressDetailsBean adressDetailsBean;
	
	@Inject
	private AdressDetailsServices adressDetailsServices;

	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();
	
	public void registerAdressDetail() {
		
		adressDetailsServices.registerAdressDetails(companyDetailsVm, adressDetailsBean.getAdressDetailsVm());
	}
	

	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}
	
	
}
