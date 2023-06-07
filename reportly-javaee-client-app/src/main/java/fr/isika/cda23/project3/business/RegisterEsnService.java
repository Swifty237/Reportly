package fr.isika.cda23.project3.business;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.esn.Esn;
//import fr.isika.cda23.project3.presentation.managedBeans.AddDocumentManagedBean;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;

@Stateless
public class RegisterEsnService {

	@Inject
	private EsnDao esnDao;

	public Long register(RegisterEsnViewModel viewModel) {

		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());

		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setBrand(viewModel.getBrand());
		companyDetails.setEmail(viewModel.getEmail());
		companyDetails.setPassword(viewModel.getPassword());
		companyDetails.setCreationDate(new Date());
		companyDetails.setAdressDetails(adressDetails);
		companyDetails.setDocument(viewModel.getDocument());

		Esn esn = new Esn();
		esn.setCompanyDetails(companyDetails);

		return esnDao.register(esn);
	}

}
