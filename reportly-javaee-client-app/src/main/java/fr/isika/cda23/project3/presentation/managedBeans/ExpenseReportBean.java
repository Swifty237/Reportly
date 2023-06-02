package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;

@ManagedBean(name = "expenseBean")
@ViewScoped
public class ExpenseReportBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3346632683202219582L;

	@Inject
	private ExpenseReportDao expenseReportDao;
	
	private ExpenseReportViewModel expenseReportViewModel = new ExpenseReportViewModel();
	
	public String addExpenseReport() {
	expenseReportDao.addExpenseReport(expenseReportViewModel);	
	expenseReportViewModel = new ExpenseReportViewModel();
	return "expenseReport.xhtml";
	}
}
