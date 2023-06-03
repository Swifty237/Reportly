package fr.isika.cda23.project3.dataInit;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.ExpenseReportState;
import fr.isika.cda.entities.common.ExpenseReport;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
	
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
	
}
