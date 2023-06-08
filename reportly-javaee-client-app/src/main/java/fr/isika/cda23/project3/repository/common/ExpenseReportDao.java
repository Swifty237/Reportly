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
		
		Document document = new Document();
		document.setName(ervm.getFileName());
		document.setDocCreation(ervm.getCreationDate());
		document.setTypeOfDoc(ervm.getDocumentType());
		
		ExpenseReport expensereport = new ExpenseReport();
		expensereport.setExpenseDate(ervm.getExpenseDate());
		expensereport.setCreationDate(ervm.getCreationDate());
		expensereport.setReason(ervm.getReason());
		expensereport.setExpenseReportState(ervm.getExpenseReportState());
		expensereport.setAmount(ervm.getAmount());
		expensereport.setDocument(document);

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

	public Long countExpenseReports() {
		String query = "SELECT count(e) FROM ExpenseReport e";
		return (Long) entityManager.createQuery(query).getSingleResult();
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

	public void deleteExpenseReport(ExpenseReport expenseReport) {
		ExpenseReport managedExpenseReport = entityManager.find(ExpenseReport.class, expenseReport.getId());
		entityManager.remove(managedExpenseReport);
	}
}