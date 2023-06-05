package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;

import fr.isika.cda23.project3.presentation.viewModels.RegisterPersonalDetailsViewModel;
import fr.isika.cda23.project3.repository.common.PersonalDetailsDao;

@Stateless
public class RegisterPersonalDetailsService {

	
	private PersonalDetailsDao personalDetailsDao;
	
	public void registerPersonalDetails(RegisterPersonalDetailsViewModel rpdvm) {
		Long id = personalDetailsDao.registerPersonalDetails(rpdvm);
		System.out.println("PersonalDetails avec id :" + id + "enregistré");
	}
}
