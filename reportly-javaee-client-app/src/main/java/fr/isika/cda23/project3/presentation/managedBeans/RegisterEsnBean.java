package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;
import fr.isika.cda23.project3.utils.FileUploadUtils;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
public class RegisterEsnBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5469910363275392680L;

	@Inject
	private RegisterEsnService reService;

	@Inject
	private EsnDao esnDao;
	
	private RegisterEsnViewModel registerEsnVm = new RegisterEsnViewModel();
	
	public void register() throws IOException {
		Esn esn =  esnDao.findByEmail(registerEsnVm.getEmail());
		if(esn == null) {
			reService.register(registerEsnVm);
			registerEsnVm = new RegisterEsnViewModel();
			NavigationUtils.redirectToUserList("login.xhtml");
		}
	}
	
	public void uploadFile(FileUploadEvent event) throws Exception {
    	String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));

    	UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());
        
		Document document = new Document();
		document.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
		document.setDocCreation(new Date());
		document.setName(fileName);
		
		registerEsnVm.setDocument(document);

		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
    }

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}
	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}
}
