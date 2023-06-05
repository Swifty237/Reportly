package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;
import fr.isika.cda23.project3.repository.common.PersonalDetailsDao;

@Stateless
public class PersonalDetailsServices {

	@Inject
	private PersonalDetailsDao personalDetailsDao;
	
	public void registerPersonalDetails(CustomerViewModel cvm, PersonalDetailsViewModel pdvm) {
		cvm.setPersonalDetails(personalDetailsDao.registerPersonalDetails(pdvm));
	}
}
