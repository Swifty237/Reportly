package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.business.DocumentServices;
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
import fr.isika.cda23.project3.utils.FileUploadUtils;
import fr.isika.cda23.project3.utils.NavigationUtils;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class DocumentBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8982587388756946010L;

//	@Inject
//	private DocumentServices documentServices;
	
	private DocumentViewModel documentVm = new DocumentViewModel();
	
	private List<Document> listDocs;
	
//	@PostConstruct
//	public void init() {
//		listDocs = documentServices.showAllDocumentsService();
//	}
	
	public void addDocument() throws IOException {
//		documentServices.addDocumentService(documentVm);
		documentVm = new DocumentViewModel();
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
	}
	
	public void deleteDoc(Long id) throws IOException {
//		documentServices.deleteDocumentService(id);
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
	}
	
    public void uploadFile(FileUploadEvent event) throws Exception {
    	String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));

    	UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());
        
		documentVm.setName(fileName);

		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
    }

    public DocumentType[] typesOfDocuments() {
    	return DocumentType.values();
    }

	public List<Document> getListDocs() {
		return listDocs;
	}

	public void setListDocs(List<Document> listDocs) {
		this.listDocs = listDocs;
	}

	public DocumentViewModel getDocumentVm() {
		return documentVm;
	}

	public void setDocumentVm(DocumentViewModel documentVm) {
		this.documentVm = documentVm;
	}
	
	
}
