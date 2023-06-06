package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;

@Stateless
public class AdressDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public AdressDetails registerAdressDetails(AdressDetailsViewModel advm) {
		
		AdressDetails adressDetails = new AdressDetails();
		
		adressDetails.setAdress(advm.getAdress());
		adressDetails.setPostalCode(advm.getPostalCode());
		adressDetails.setCity(advm.getCity());
		adressDetails.setCountry(advm.getCountry());
		
		entityManager.persist(adressDetails);
		return adressDetails;
	}
}
