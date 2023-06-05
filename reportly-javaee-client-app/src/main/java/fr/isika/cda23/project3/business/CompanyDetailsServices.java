package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.RegisterCompanyDetailsViewModel;
import fr.isika.cda23.project3.repository.common.CompanyDetailsDao;

@Stateless
public class RegisterCompanyDetailsService {

	@Inject
	private CompanyDetailsDao companyDetailsDao;
	
	public void registerCompanyDetails(RegisterCompanyDetailsViewModel rcdvm) {
		Long id = companyDetailsDao.registerCompanyDetails(rcdvm);
		System.out.println("CompanyDetails avec id : " + id + "enregistré");
	}
}
