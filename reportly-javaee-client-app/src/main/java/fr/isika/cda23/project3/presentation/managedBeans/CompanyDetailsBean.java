package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.CompanyDetailsServices;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;

@ManagedBean
public class CompanyDetailsBean {
	
//	@Inject
//	private CompanyDetailsServices companyDetailsServices;
	
	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();

	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}
	
	
}
