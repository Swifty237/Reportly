package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;

@Stateless
public class ExpenseReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addExpenseReport(ExpenseReportViewModel ervm) {

<<<<<<< HEAD
		ExpenseReport expenseReport = new ExpenseReport();

		expenseReport.setExpenseDate(ervm.getExpenseDate());
		expenseReport.setCreationDate(ervm.getCreationDate());
		expenseReport.setReason(ervm.getReason());
		expenseReport.setAmount(ervm.getAmount());

		entityManager.persist(expenseReport);
=======
		Document document = new Document();
		document.setName(ervm.getFileName());
		document.setDocCreation(ervm.getCreationDate());
		document.setTypeOfDoc(ervm.getDocumentType());

		ExpenseReport expensereport = new ExpenseReport();
		expensereport.setExpenseDate(ervm.getExpenseDate());
		expensereport.setCreationDate(ervm.getCreationDate());
		expensereport.setReason(ervm.getReason());
		expensereport.setAmount(ervm.getAmount());
		expensereport.setDocument( document);
		
		entityManager.persist(expensereport);
>>>>>>> a2bb553 (Final UC)

<<<<<<< HEAD
		System.out.println("ExpenseReport : " + ervm.toString() + " persisté");

		return expenseReport.getId();
=======
		return expensereport.getId();
>>>>>>> 2269e5e (Full ExpenseReport Page)
	}

	public ExpenseReport getExpenseReportById(Long id) {
	    return entityManager.find(ExpenseReport.class, id);
	}

	public List<ExpenseReport> getAllExpenseReports() {
		String query = "SELECT e FROM ExpenseReport e";
		return entityManager.createQuery(query, ExpenseReport.class).getResultList();
	}

	public void updateExpenseReport(ExpenseReportViewModel ervm) {
		ExpenseReport expenseReport = entityManager.find(ExpenseReport.class, ervm.getId());
		if (expenseReport != null) {
			expenseReport.setExpenseDate(ervm.getExpenseDate());
			expenseReport.setCreationDate(ervm.getCreationDate());
			expenseReport.setReason(ervm.getReason());
			expenseReport.setAmount(ervm.getAmount());

			entityManager.merge(expenseReport);
		}
	}

<<<<<<< HEAD
//	public void deleteExpenseReport(Long id) {
//		ExpenseReport expenseReport = entityManager.find(ExpenseReport.class, id);
//
//		if (expenseReport != null) {
//			entityManager.remove(expenseReport);
//
//			System.out.println("ExpenseReport with ID " + id + " deleted");
//		}
//	}
	
	public void deleteExpenseReport(ExpenseReport expenseReport) {
			entityManager.remove(expenseReport);
			System.out.println("Note de frais supprimé ================================================");
=======
	public void deleteExpenseReport(ExpenseReport expenseReport) {
	    ExpenseReport managedExpenseReport = entityManager.find(ExpenseReport.class, expenseReport.getId());
	    entityManager.remove(managedExpenseReport);
>>>>>>> 2269e5e (Full ExpenseReport Page)
	}
}
