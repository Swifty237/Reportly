package fr.cda23.projet3.repository.ESN;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.ServicePremium;
import fr.isika.cda.entities.esn.Subscription;

public class ServicePremiumDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public ServicePremiumDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Long persister(ServicePremium servicePremium) {
		
		
		
		entityManager.persist(servicePremium);
		
		return servicePremium.getId();
	}
	
	public void UpDate(ServicePremium servicePremium) {
		
		entityManager.merge(servicePremium);
		
	}
	
	public void Delete(ServicePremium servicePremium) {
		entityManager.remove(servicePremium);
		System.out.println("**************l'abonnement est supprimé************");
		
	}
	
	public ServicePremium findById(long id) {
		return entityManager.find(ServicePremium.class, id);
	
	}
	
	
}
