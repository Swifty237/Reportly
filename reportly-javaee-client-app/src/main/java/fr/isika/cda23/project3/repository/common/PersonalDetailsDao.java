package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;

@Stateless
public class PersonalDetailsDao {

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

	public void removePersonalDetails(PersonalDetails personalDetails) {
		entityManager.remove(personalDetails);
		System.out.println("les données personnelles sont supprimées ========================");
	}

	public void updatePersonalDetails(PersonalDetails personalDetails) {
		entityManager.merge(personalDetails);

	}

	public PersonalDetails findPersonalDetailsById(Long id) {
		return entityManager.find(PersonalDetails.class, id);
	}

}
