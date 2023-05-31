package fr.cda23.projet3.repository.ESN;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.ServiceBasic;


public class ServiceBasicDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public ServiceBasicDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Long persister() {
		ServiceBasic serviceBasic = new ServiceBasic();
		
		
		
		
		
		entityManager.persist(serviceBasic);
		
		return serviceBasic.getId();
	}
	
	public void UpDate(ServiceBasic serviceBasic) {
		
		entityManager.merge(serviceBasic);
		
	}
	
	public void Delete(ServiceBasic serviceBasic) {
		entityManager.remove(serviceBasic);
		System.out.println("**************l'abonnement est supprimé************");
		
	}
	
	public ServiceBasic findById(long id) {
		return entityManager.find(ServiceBasic.class, id);
	
	}
	

}
