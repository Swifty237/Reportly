//package fr.isika.cda23.project3.business;
//
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//
//import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
//import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
//import fr.isika.cda23.project3.repository.common.CompanyDetailsDao;
//
//@Stateless
//public class CompanyDetailsServices {
//
//	@Inject
//	private CompanyDetailsDao companyDetailsDao;
//	
//	public void registerCompanyDetails(CustomerViewModel cvm, CompanyDetailsViewModel cdvm) {
//		cvm.setCompanyDetails(companyDetailsDao.registerCompanyDetails(cdvm));
//	}
//}
