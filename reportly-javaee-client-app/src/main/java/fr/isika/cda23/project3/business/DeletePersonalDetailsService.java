package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda23.project3.repository.common.PersonalDetailsDao;

@Stateless
public class DeletePersonalDetailsService {

	
	private PersonalDetailsDao personalDetailsDao;
	
	public void deletePersonalDetails(Long id) {
		PersonalDetails personalDetails = personalDetailsDao.findPersonalDetailsById(id);
		personalDetailsDao.removePersonalDetails(personalDetails);
		
	}
}
