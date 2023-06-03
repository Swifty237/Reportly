package fr.isika.cda23.project3.dataInit;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.contract.Customer;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
	
	//System.out.println("Test persist ---------------------------------------------------------");
		//	CompanyDetails companyDetails = new CompanyDetails();
			
			//PersonalDetails personalDetails = new PersonalDetails();		
		//	Customer customer = new Customer();
			
			//customer.setCompanyDetails(companyDetails);
			//customer.setPersonalDetails(personalDetails);
			
		//	em.persist(customer);
		
		
		// Supprimer un client existant
//		Long customerIdToDelete = 1L; // Remplacez "1L" par l'identifiant du client à supprimer
//		Customer customer = em.find(Customer.class, customerIdToDelete);
//		if (customer != null) {
//			em.remove(customer);
//			System.out.println("Client supprimé avec succès");
//		} else {
//			System.out.println("Client introuvable");
//		}
	}
	
}
