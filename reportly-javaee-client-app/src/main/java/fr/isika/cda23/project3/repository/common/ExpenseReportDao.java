package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.isika.cda.entities.common.ExpenseReport;

import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;

public class ExpenseReportDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addExpenseReport(ExpenseReportViewModel ervm) {

		ExpenseReport expensereport = new ExpenseReport();

		expensereport.setId(ervm.getId());
		expensereport.setExpenseDate(ervm.getExpenseDate());
		expensereport.setCreationDate(ervm.getCreationDate());
		expensereport.setReason(ervm.getReason());
		expensereport.setAmount(ervm.getAmount());

		entityManager.persist(expensereport);

		System.out.println("ExpenseReport : " + ervm.toString() + " persisté");

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

	public void deleteExpenseReport(Long id) {
		ExpenseReport expensereport = entityManager.find(ExpenseReport.class, id);

		if (expensereport != null) {
			entityManager.remove(expensereport);

			System.out.println("ExpenseReport with ID " + id + " deleted");
		}
	}
}
