package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.business.ExpenseReportServices;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
public class ExpenseReportBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3346632683202219582L;

	@Inject
	private ExpenseReportServices expenseReportServices;

	private ExpenseReportViewModel expenseReportViewModel = new ExpenseReportViewModel();
	
	private List<ExpenseReport> listExpenseReports;
	private int countExpenseReports;
	
	@PostConstruct
	public void init() {
		listExpenseReports = expenseReportServices.getAllExpenseReportsService();
		countExpenseReports = expenseReportServices.countExpenseReports();
	}

	public String addExpenseReport() {
		expenseReportServices.addExpenseReportService(expenseReportViewModel);
		expenseReportViewModel = new ExpenseReportViewModel();
		return "expenseReport.xhtml";
	}
	
	public void deleteExpenseReport(Long id) throws IOException {
		expenseReportServices.deleteExpenseReportService(id);
		NavigationUtils.redirectToUserList("expenseReport.xhtml");
	}

	public List<ExpenseReport> getListExpenseReports() {
		return listExpenseReports;
	}

	public void setListExpenseReports(List<ExpenseReport> listExpenseReports) {
		this.listExpenseReports = listExpenseReports;
	}

	public int getCountExpenseReports() {
		return countExpenseReports;
	}

	public void setCountExpenseReports(int countExpenseReports) {
		this.countExpenseReports = countExpenseReports;
	}
}
