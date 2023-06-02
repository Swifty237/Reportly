package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import fr.isika.cda.entities.common.ExpenseReport;

import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;

public class ExpenseReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addExpenseReport(ExpenseReportViewModel ervm) {

		ExpenseReport expenseReport = new ExpenseReport();

		expenseReport.setExpenseDate(ervm.getExpenseDate());
		expenseReport.setCreationDate(ervm.getCreationDate());
		expenseReport.setReason(ervm.getReason());
		expenseReport.setAmount(ervm.getAmount());

		entityManager.persist(expenseReport);

		System.out.println("ExpenseReport : " + ervm.toString() + " persisté");

		return expenseReport.getId();
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

			System.out.println("ExpenseReport: " + ervm.toString() + " updated");
		}
	}

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
	}
}
