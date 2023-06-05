package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.repository.common.AdressDetailsDao;

@Stateless
public class AdressDetailsServices {
	
	@Inject
	private AdressDetailsDao adressDetailsDao;
	
	public void registerAdressDetails(CustomerViewModel cvm, AdressDetailsViewModel advm) {
		cvm.setAdressDetails(adressDetailsDao.registerAdressDetails(advm));
	}
}
