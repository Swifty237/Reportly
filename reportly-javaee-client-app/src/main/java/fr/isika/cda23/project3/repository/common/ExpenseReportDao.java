package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.isika.cda.entities.common.ExpenseReport;

import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;

@Stateless
public class ExpenseReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addExpenseReport(ExpenseReportViewModel ervm) {

		ExpenseReport expensereport = new ExpenseReport();

		expensereport.setExpenseDate(ervm.getExpenseDate());
		expensereport.setCreationDate(ervm.getCreationDate());
		expensereport.setReason(ervm.getReason());
		expensereport.setAmount(ervm.getAmount());

		entityManager.persist(expensereport);

		return expensereport.getId();
	}

	public ExpenseReport getExpenseReportById(Long id) {
	    return entityManager.find(ExpenseReport.class, id);
	}

	public List<ExpenseReport> getAllExpenseReports() {
		String query = "SELECT e FROM ExpenseReport e";
		return entityManager.createQuery(query, ExpenseReport.class).getResultList();
	}

	public void updateExpenseReport(ExpenseReportViewModel ervm) {
		ExpenseReport expensereport = entityManager.find(ExpenseReport.class, ervm.getId());

		if (expensereport != null) {
			expensereport.setExpenseDate(ervm.getExpenseDate());
			expensereport.setCreationDate(ervm.getCreationDate());
			expensereport.setReason(ervm.getReason());
			expensereport.setAmount(ervm.getAmount());

			entityManager.merge(expensereport);

			System.out.println("ExpenseReport: " + ervm.toString() + " updated");
		}
	}

	public void deleteExpenseReport(ExpenseReport expenseReport) {
	    ExpenseReport managedExpenseReport = entityManager.find(ExpenseReport.class, expenseReport.getId());
	    entityManager.remove(managedExpenseReport);
	}
}
