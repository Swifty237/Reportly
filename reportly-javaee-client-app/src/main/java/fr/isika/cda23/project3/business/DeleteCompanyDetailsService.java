package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda23.project3.repository.common.CompanyDetailsDao;

@Stateless
public class DeleteCompanyDetailsService {

	
	
	private CompanyDetailsDao companyDetailsDao;
	
	public void deleteCompanyDetails(Long id) {
		CompanyDetails companyDetails = companyDetailsDao.findCompanyDetailsById(id);
		companyDetailsDao.removeCompanyDetails(companyDetails);
	}
}
