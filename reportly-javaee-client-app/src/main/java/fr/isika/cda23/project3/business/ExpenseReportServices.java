package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;

@Stateless
public class ExpenseReportServices {

	@Inject
	private ExpenseReportDao expenseReportDao;
	
	public void addExpenseReportService(ExpenseReportViewModel expenseReportVm) {
		Long id = expenseReportDao.addExpenseReport(expenseReportVm);
		System.out.println("Note de frais avec id : " + id + "enregistrée");
	}
	
	public void DeleteExpenseReportService(Long id) {
		ExpenseReport expenseReport = expenseReportDao.getExpenseReportById(id);
		expenseReportDao.deleteExpenseReport(expenseReport);
	}
	
	public List<ExpenseReport> getAllExpenseReportsService() {
		return expenseReportDao.getAllExpenseReports();
	}
	
	public int countExpenseReports() {
		return getAllExpenseReportsService().size();
	}
}
