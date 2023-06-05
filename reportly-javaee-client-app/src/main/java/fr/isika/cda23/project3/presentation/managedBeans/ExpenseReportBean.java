package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;

@ManagedBean
@SessionScoped
public class ExpenseReportBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4433798209344858186L;

	@Inject
	private ExpenseReportDao expenseReportDao;

	private ExpenseReportViewModel expenseReportViewModel;

	private List<ExpenseReportViewModel> expenseReports;

	public ExpenseReportBean() {
		expenseReportViewModel = new ExpenseReportViewModel();
		expenseReports = new ArrayList<>();
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