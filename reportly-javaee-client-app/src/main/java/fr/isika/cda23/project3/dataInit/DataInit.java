package fr.isika.cda23.project3.dataInit;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda.entities.esn.ServiceDetails;
import fr.isika.cda.entities.esn.ServicePremium;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
	
		int nbservices = em.createQuery("SELECT count(s) FROM ServiceBasic s").getFirstResult();
		if( nbservices <= 0 ) {
			ServiceDetails serviceDetails = new ServiceDetails();
			serviceDetails.setContractsLimitation(10);
			serviceDetails.setUsersLimitation(50);
			serviceDetails.setActiveCustomDesign(true);
			serviceDetails.setActiveExpenseReport(true);
			serviceDetails.setActiveStatisticReport(false);
	
			ServiceBasic sb = new ServiceBasic();
			sb.setCreationDate(new Date());
			sb.setEnabled(true);
			sb.setPrice(11);
			sb.setServiceDetails(serviceDetails);
			
			ServiceDetails secondServiceDetails = new ServiceDetails();
			secondServiceDetails.setContractsLimitation(10);
			secondServiceDetails.setUsersLimitation(50);
			secondServiceDetails.setActiveCustomDesign(true);
			secondServiceDetails.setActiveExpenseReport(true);
			secondServiceDetails.setActiveStatisticReport(true);
			
			ServicePremium sm  = new ServicePremium();
			sm.setCreationDate(new Date());
			sm.setEnabled(true);
			sm.setPrice(30);
			sm.setServiceDetails(secondServiceDetails);
			
			em.persist(sb);
			em.persist(sm);
		}
		
		
		// Supprimer un client existant
		
		Long customerIdToDelete = 1L; // Remplacez "1L" par l'identifiant du client à supprimer
		Customer customer = em.find(Customer.class, customerIdToDelete);
		if (customer != null) {
			em.remove(customer);
			System.out.println("Client supprimé avec succès");
		} else {
			System.out.println("Client introuvable");
		}
	}	
}
