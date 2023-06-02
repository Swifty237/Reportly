package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;

@ManagedBean(name = "expenseBean")
@SessionScoped
public class ExpenseReportBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3346632683202219582L;

	@Inject
	private ExpenseReportDao expenseReportDao;

	private ExpenseReportViewModel expenseReportVm = new ExpenseReportViewModel();
	private List<ExpenseReport> expenseReports;

	    public void setExpenseReportDao(ExpenseReportDao expenseReportDao) {
	        this.expenseReportDao = expenseReportDao;
	    }

	    public ExpenseReportViewModel getExpenseReport() {
	        return expenseReportVm;
	    }

	    public void setExpenseReport(ExpenseReportViewModel expenseReport) {
	        this.expenseReportVm = expenseReport;
	    }

	    public List<ExpenseReport> getExpenseReports() {
	        if (expenseReports == null) {
	            expenseReports = expenseReportDao.getAllExpenseReports();
	        }
	        return expenseReports;
	    }

	    public void addExpenseReport() {
	        Long id = expenseReportDao.addExpenseReport(expenseReportVm);
	        expenseReportVm.setId(id);
	        expenseReports = null; // Invalidate the cached expenseReports list
	        expenseReportVm = new ExpenseReportViewModel();
	    }

	    public void updateExpenseReport(ExpenseReportViewModel ervm) {
	        expenseReportDao.updateExpenseReport(ervm);
	    }

	    public void deleteExpenseReport(Long id) {
	        expenseReportDao.deleteExpenseReport(id);
	        expenseReports = null; // Invalidate the cached expenseReports list
	    }
	}
