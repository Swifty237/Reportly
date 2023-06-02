package fr.isika.cda23.project3.dataInit;

import java.util.Date;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> b62d91c (Backend card - Note de frais - done)

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

<<<<<<< HEAD
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda.entities.esn.ServiceDetails;
import fr.isika.cda.entities.esn.ServicePremium;
=======
import fr.isika.cda.entities.common.ErState;
import fr.isika.cda.entities.common.ExpenseReport;
>>>>>>> b62d91c (Backend card - Note de frais - done)

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
	
<<<<<<< HEAD
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
=======
//		ExpenseReport expenseReport = new ExpenseReport();
//		expenseReport.setExpenseDate(new Date());
//		expenseReport.setCreationDate(new Date());
//		expenseReport.setReason("Business trip");
//		expenseReport.setAmount(500.0);
//		expenseReport.setPaidState(ErState.PAID);
//		
//		ExpenseReport expenseReport1 = new ExpenseReport();
//		expenseReport1.setExpenseDate(new Date());
//		expenseReport1.setCreationDate(new Date());
//		expenseReport1.setReason("Office supplies");
//		expenseReport1.setAmount(100.0);
//		expenseReport1.setPaidState(ErState.PAID);
//		
//		ExpenseReport expenseReport2 = new ExpenseReport();
//		expenseReport2.setExpenseDate(new Date());
//		expenseReport2.setCreationDate(new Date());
//		expenseReport2.setReason("Dinner with clients");
//		expenseReport2.setAmount(250.0);
//		expenseReport2.setPaidState(ErState.NOT_PAID);
//		
//		em.persist(expenseReport);
//		em.persist(expenseReport1);
//		em.persist(expenseReport2);
		
	}
	
>>>>>>> b62d91c (Backend card - Note de frais - done)
}
