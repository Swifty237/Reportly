package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;
import fr.isika.cda23.projet3.repository.GenericDao;

@Stateless
public class PersonalDetailsDao extends GenericDao<PersonalDetails, Long> {

	@PersistenceContext
	private EntityManager entityManager;

	public PersonalDetails registerPersonalDetails(PersonalDetailsViewModel pdvm) {

		PersonalDetails personalDetails = new PersonalDetails();

		personalDetails.setName(pdvm.getName());
		personalDetails.setBirthday(pdvm.getBirthday());
		personalDetails.setFirstname(pdvm.getFirstname());
		personalDetails.setJobTitle(pdvm.getJobTitle());
		personalDetails.setPhoneNumber(pdvm.getPhoneNumber());
		personalDetails.setCreationDate(pdvm.getCreationDate());

		entityManager.persist(personalDetails);
		return personalDetails;
	}

}
