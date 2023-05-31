package fr.cda23.projet3.repository.ESN;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.CustomDesignDetails;
import fr.isika.cda.entities.esn.ServiceBasic;

public class CustomDesignDetailsDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public CustomDesignDetailsDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Long persister( CustomDesignDetails  customDesignDetails) {
		
		
		
		entityManager.persist(customDesignDetails);
		
		return customDesignDetails.getId();
	}
	
	public void UpDate( CustomDesignDetails customDesignDetails) {
		
		entityManager.merge(customDesignDetails);
		
	}
	
	public void Delete( CustomDesignDetails customDesignDetails) {
		entityManager.remove(customDesignDetails);
		System.out.println("**************l'abonnement est supprimé************");
		
	}
	
	public  CustomDesignDetails findById(long id) {
		return entityManager.find( CustomDesignDetails.class, id);
	
	}
}
