package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.business.AddDocumentService;
import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
import fr.isika.cda23.project3.utils.FileUploadUtils;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
public class AddDocumentManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7894012894065522183L;

	@Inject
	private AddDocumentService adService;

	private AddDocumentViewModel advm = new AddDocumentViewModel();

	public void addDocument() throws IOException {
		adService.addDocument(advm);
		advm = new AddDocumentViewModel();
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
	}

	public void uploadFile(FileUploadEvent event) throws Exception {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));

		UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());

		advm.setName(fileName);
		
		Document document = new Document();
		document.setName(fileName);
		RegisterEsnService.getDoc(document);

		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
	}

	public DocumentType[] typesOfDocuments() {
		return DocumentType.values();
	}

	public AddDocumentViewModel getAdvm() {
		return advm;
	}

	public void setAdvm(AddDocumentViewModel advm) {
		this.advm = advm;
	}
}
