package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.DeleteCompanyDetailsService;

import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class DeleteCompanyDetailsBean {

	
	@Inject
	private DeleteCompanyDetailsService rmCompanyDetailsService;
	
	
	public void deleteCompanyDetails(Long id) throws IOException{
		rmCompanyDetailsService.deleteCompanyDetails(id);
		NavigationUtils.redirectToUserList("");
	}
	
}
