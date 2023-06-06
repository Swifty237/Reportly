package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
import fr.isika.cda23.project3.repository.common.AdressDetailsDao;

@Stateless
public class AdressDetailsServices {
	
	@Inject
	private AdressDetailsDao adressDetailsDao;
	
	public void registerAdressDetails(CompanyDetailsViewModel cdvm, AdressDetailsViewModel advm) {
		cdvm.setAdressDetails(adressDetailsDao.registerAdressDetails(advm));
	}
}
