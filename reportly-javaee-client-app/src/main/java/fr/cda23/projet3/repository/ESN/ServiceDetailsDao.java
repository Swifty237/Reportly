package fr.cda23.projet3.repository.ESN;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.ServiceDetails;
import fr.isika.cda.entities.esn.ServicePremium;

public class ServiceDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public ServiceDetailsDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Long persister() {
		ServiceDetails serviceDetails = new ServiceDetails();
		
		
		entityManager.persist(serviceDetails);
		
		return serviceDetails.getId();
	}
	
	public void UpDate(ServiceDetails serviceDetails) {
		
		entityManager.merge(serviceDetails);
		
	}
	
	public void Delete(ServiceDetails serviceDetails) {
		entityManager.remove(serviceDetails);
		System.out.println("**************l'abonnement est supprimé************");
		
	}
	
	public ServiceDetails findById(long id) {
		return entityManager.find(ServiceDetails.class, id);
	
	}
}
