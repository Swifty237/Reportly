package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.business.ExpenseReportServices;
=======
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
>>>>>>> 5f75810 (Latest changes)
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

<<<<<<< HEAD
@ManagedBean
=======
@ManagedBean(name = "expenseBean")
>>>>>>> 5f75810 (Latest changes)
@SessionScoped
public class ExpenseReportBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3346632683202219582L;

	@Inject
<<<<<<< HEAD
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
=======
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
>>>>>>> 5f75810 (Latest changes)
	}
