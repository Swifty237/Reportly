package fr.isika.cda23.project3.presentation.managedBeans;
 
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;
import fr.isika.cda23.project3.utils.FileUploadUtils;
 
@ManagedBean
@SessionScoped
public class ExpenseReportBean implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 6669005664250781823L;
 
	@Inject
	private ExpenseReportDao expenseReportDao;
 
	private List<ExpenseReportViewModel> expenseReports;
    private ExpenseReportViewModel expenseReportViewModel;
    
    private UploadedFile uploadedFile;
 
    @PostConstruct
    public void init() {
        expenseReports = new ArrayList<>();
        expenseReportViewModel = new ExpenseReportViewModel();
    }
 
    public void addExpenseReport() {
        // Add the expense report to the list
        expenseReports.add(expenseReportViewModel);
        expenseReportDao.addExpenseReport(expenseReportViewModel);
 
        // Reset the form
        expenseReportViewModel = new ExpenseReportViewModel();
        uploadedFile = null;
    }
 
    public void uploadFile(FileUploadEvent event) throws Exception {
    	String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));
 
    	UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());
 
		expenseReportViewModel.setFileName(fileName);
 
		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
    }
    
    public Integer countExpenseReports() {
    	return expenseReportDao.getAllExpenseReports().size();
    }
    
    public void deleteExpenseReport(ExpenseReportViewModel expenseReport) {
        expenseReports.remove(expenseReport);
    }
 
    public void editExpenseReport(ExpenseReportViewModel expenseReport) {
        expenseReportViewModel = expenseReport;
    }
 
    public List<ExpenseReportViewModel> getExpenseReports() {
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
 