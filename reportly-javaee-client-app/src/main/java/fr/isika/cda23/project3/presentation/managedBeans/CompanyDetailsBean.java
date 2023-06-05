package fr.isika.cda23.project3.presentation.managedBeans;


import javax.faces.bean.ManagedBean;

import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;

@ManagedBean
public class CompanyDetailsBean {

	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();

	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}
	
	
}
