package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;

@Stateless
public class RegisterEsnService {

	@Inject
	private EsnDao esnDao;

	public void register(RegisterEsnViewModel viewModel) {
		Esn esn = new Esn();
		
//		AdressDetails adressDetails = new AdressDetails();
//		adressDetails.setAdress(viewModel.getAdress());
//		adressDetails.setCity(viewModel.getCity());
//		adressDetails.setCountry(viewModel.getCountry());
//		adressDetails.setPostalCode(viewModel.getPostalCode());
//		
//		CompanyDetails

	}
}
