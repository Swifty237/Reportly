package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import fr.isika.cda23.project3.business.RegisterCompanyDetailsService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterCompanyDetailsViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

public class RegisterCompanyDetailsBean {
	
	private RegisterCompanyDetailsService rcdService;
	private RegisterCompanyDetailsViewModel rcdvm = new RegisterCompanyDetailsViewModel();
	
	public void registerCompanyDetails()throws IOException{
		
		rcdService.registerCompanyDetails(rcdvm);
		rcdvm = new RegisterCompanyDetailsViewModel();
		
		NavigationUtils.redirectToUserList("");
	}

	public RegisterCompanyDetailsService getRcdService() {
		return rcdService;
	}

	public void setRcdService(RegisterCompanyDetailsService rcdService) {
		this.rcdService = rcdService;
	}

	public RegisterCompanyDetailsViewModel getRcdvm() {
		return rcdvm;
	}

	public void setRcdvm(RegisterCompanyDetailsViewModel rcdvm) {
		this.rcdvm = rcdvm;
	}
	
	

}
