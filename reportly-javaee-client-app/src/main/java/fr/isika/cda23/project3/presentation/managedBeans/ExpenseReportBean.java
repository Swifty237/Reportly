package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda.entities.common.ExpenseReportState;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;

@ManagedBean
@SessionScoped
public class ExpenseReportBean implements Serializable {

    private static final long serialVersionUID = 6669005664250781823L;

    @Inject
    private ExpenseReportDao expenseReportDao;

    private List<ExpenseReport> expenseReports;
    private ExpenseReportViewModel expenseReportViewModel;
    
    private UploadedFile uploadedFile;

    @PostConstruct
    public void init() {
        expenseReports = expenseReportDao.getAllExpenseReports();
        expenseReportViewModel = new ExpenseReportViewModel();
    }

    public void addExpenseReport() {
        expenseReportViewModel.setExpenseReportState(ExpenseReportState.PENDING);

        // Persist the expense report
        Long id = expenseReportDao.addExpenseReport(expenseReportViewModel);

        // Update the expenseReports list
        ExpenseReport expenseReport = expenseReportDao.getExpenseReportById(id);
        expenseReports.add(expenseReport);

        // Reset the form
        expenseReportViewModel = new ExpenseReportViewModel();
    }

    public void deleteExpenseReport(ExpenseReport expenseReport) {
        expenseReportDao.deleteExpenseReport(expenseReport);
        expenseReports.remove(expenseReport);
    }

    public List<ExpenseReport> getExpenseReports() {
        return expenseReports;
    }

    public ExpenseReportViewModel getExpenseReportViewModel() {
        return expenseReportViewModel;
    }
    
    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }
 
    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
 
    public DocumentType[] documentTypes() {
    	return DocumentType.values();
    }
}
