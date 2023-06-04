package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda23.project3.presentation.viewModels.RegisterPersonalDetailsViewModel;

@Stateless
public class PersonalDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long registerPersonalDetails(RegisterPersonalDetailsViewModel rpdvm) {
	
	PersonalDetails personalDetails = new PersonalDetails();
	
	personalDetails.setName(rpdvm.getName());
	personalDetails.setBirthday(rpdvm.getBirthday());
	personalDetails.setFirstname(rpdvm.getFirstname());
	personalDetails.setJobTitle(rpdvm.getJobTitle());
	personalDetails.setPhoneNumber(rpdvm.getPhoneNumber());
	personalDetails.setCreationDate(rpdvm.getCreationDate());
	
	entityManager.persist(personalDetails);
	System.out.println("PersonalDetails :"  + rpdvm.toString() + "persisté");
	
	return personalDetails.getId();
	
	}
	
	public void removePersonalDetails(PersonalDetails personalDetails) {
		entityManager.remove(personalDetails);
		System.out.println("les données personnelles sont supprimées ========================");
	}
	
	
	public void updatePersonalDetails(PersonalDetails personalDetails) {
		entityManager.merge(personalDetails);
	
	}

	public PersonalDetails findPersonalDetailsById(Long id) {
		return entityManager.find(PersonalDetails.class,id);
	}
	
}
	

