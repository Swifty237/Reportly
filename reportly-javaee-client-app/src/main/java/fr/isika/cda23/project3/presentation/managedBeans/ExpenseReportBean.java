package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
=======
import javax.faces.application.FacesMessage;
>>>>>>> 2269e5e (Full ExpenseReport Page)
=======
import javax.annotation.PostConstruct;
>>>>>>> a2bb553 (Final UC)
import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
import javax.inject.Inject;

import fr.isika.cda.entities.common.ExpenseReport;
import fr.isika.cda23.project3.business.ExpenseReportServices;
=======
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

<<<<<<< HEAD
import fr.isika.cda.entities.common.ExpenseReport;
>>>>>>> 5f75810 (Latest changes)
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;
=======
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.presentation.viewModels.ExpenseReportViewModel;
import fr.isika.cda23.project3.repository.common.ExpenseReportDao;
import fr.isika.cda23.project3.utils.FileUploadUtils;
>>>>>>> a2bb553 (Final UC)

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
	private static final long serialVersionUID = 6669005664250781823L;
	
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
	
	private List<ExpenseReportViewModel> expenseReports;
    private ExpenseReportViewModel expenseReportViewModel;
    private UploadedFile uploadedFile;

<<<<<<< HEAD
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
=======
    @PostConstruct
    public void init() {
        expenseReports = new ArrayList<>();
        expenseReportViewModel = new ExpenseReportViewModel();
    }
>>>>>>> a2bb553 (Final UC)

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
