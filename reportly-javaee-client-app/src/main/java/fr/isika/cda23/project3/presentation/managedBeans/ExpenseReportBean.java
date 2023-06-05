package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
=======
import javax.faces.application.FacesMessage;
>>>>>>> 2269e5e (Full ExpenseReport Page)
import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.business.ExpenseReportServices;
=======
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
>>>>>>> 5f75810 (Latest changes)
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

<<<<<<< HEAD
<<<<<<< HEAD
@ManagedBean
=======
@ManagedBean(name = "expenseBean")
>>>>>>> 5f75810 (Latest changes)
=======
@ManagedBean
>>>>>>> 2269e5e (Full ExpenseReport Page)
@SessionScoped
public class ExpenseReportBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4433798209344858186L;

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

	private ExpenseReportViewModel expenseReportViewModel;

	private List<ExpenseReportViewModel> expenseReports;

<<<<<<< HEAD
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
=======
	public ExpenseReportBean() {
		expenseReportViewModel = new ExpenseReportViewModel();
		expenseReports = new ArrayList<>();
>>>>>>> 2269e5e (Full ExpenseReport Page)
	}

	public void addExpenseReport() {
		Long id = expenseReportDao.addExpenseReport(expenseReportViewModel);
		expenseReportViewModel.setId(id);
		expenseReports.add(expenseReportViewModel);

		expenseReportViewModel = new ExpenseReportViewModel(); // Reset the object

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Expense report added successfully!"));
	}

	public String editExpenseReport(ExpenseReportViewModel ervm) {
		expenseReportViewModel = ervm;
		return "editExpenseReport";
	}

	public String updateExpenseReport() {
		expenseReportDao.updateExpenseReport(expenseReportViewModel);
		expenseReportViewModel = new ExpenseReportViewModel();
		return "expenseReports";
	}

	public void deleteExpenseReport(ExpenseReportViewModel ervm) {
		ExpenseReport expenseReport = expenseReportDao.getExpenseReportById(ervm.getId());
		expenseReportDao.deleteExpenseReport(expenseReport);
		expenseReports.remove(ervm);
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Success", "Expense report deleted successfully!"));
	}

	public List<ExpenseReportViewModel> getExpenseReports() {
		expenseReports = mapToViewModel(expenseReportDao.getAllExpenseReports());
		return expenseReports;
	}

	private List<ExpenseReportViewModel> mapToViewModel(List<ExpenseReport> expenseReports) {
		List<ExpenseReportViewModel> viewModels = new ArrayList<>();
		for (ExpenseReport er : expenseReports) {
			ExpenseReportViewModel viewModel = new ExpenseReportViewModel();
			viewModel.setId(er.getId());
			viewModel.setExpenseDate(er.getExpenseDate());
			viewModel.setCreationDate(er.getCreationDate());
			viewModel.setReason(er.getReason());
			viewModel.setAmount(er.getAmount());
			viewModels.add(viewModel);
		}
		return viewModels;
	}

	public ExpenseReportViewModel getExpenseReportViewModel() {
		return expenseReportViewModel;
	}

	public void setExpenseReportViewModel(ExpenseReportViewModel expenseReportViewModel) {
		this.expenseReportViewModel = expenseReportViewModel;
	}
}