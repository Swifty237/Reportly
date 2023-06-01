package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 3d333c7 (user)
=======
import java.io.Serializable;
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> b7c6b2a (user)
=======
import java.io.Serializable;
>>>>>>> a6ba52f (register esn ok)
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> a6ba52f (register esn ok)
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.business.AddDocumentService;
import fr.isika.cda23.project3.business.RegisterEsnService;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.business.AddDocumentService;
>>>>>>> 3d333c7 (user)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda23.project3.business.AddDocumentService;
>>>>>>> b7c6b2a (user)
=======
>>>>>>> a6ba52f (register esn ok)
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
import fr.isika.cda23.project3.utils.FileUploadUtils;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> a6ba52f (register esn ok)
public class AddDocumentManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7894012894065522183L;

<<<<<<< HEAD
<<<<<<< HEAD
	@Inject
	private AddDocumentService adService;

	private AddDocumentViewModel advm = new AddDocumentViewModel();

	public void addDocument() throws IOException {
=======
=======
>>>>>>> b7c6b2a (user)
public class AddDocumentManagedBean {
	
	@Inject
	private static AddDocumentService adService;
	
	private static AddDocumentViewModel advm = new AddDocumentViewModel();
	
	public static void addDocument() throws IOException {
<<<<<<< HEAD
>>>>>>> 3d333c7 (user)
=======
	@Inject
=======
	@Inject
>>>>>>> a6ba52f (register esn ok)
	private AddDocumentService adService;

	private AddDocumentViewModel advm = new AddDocumentViewModel();

	public void addDocument() throws IOException {
<<<<<<< HEAD
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> b7c6b2a (user)
=======
>>>>>>> a6ba52f (register esn ok)
		adService.addDocument(advm);
		advm = new AddDocumentViewModel();
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

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

=======
	
    public void uploadFile(FileUploadEvent event) throws Exception {
    	String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));
=======
>>>>>>> ab3abe1 (register esn ok)

	public void uploadFile(FileUploadEvent event) throws Exception {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));

		UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());

		advm.setName(fileName);
		
		Document document = new Document();
		document.setName(fileName);
		RegisterEsnService.getDoc(document);

		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
<<<<<<< HEAD
=======
	
    public void uploadFile(FileUploadEvent event) throws Exception {
    	String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));
=======
>>>>>>> a6ba52f (register esn ok)

	public void uploadFile(FileUploadEvent event) throws Exception {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));

		UploadedFile uploadedFile = event.getFile();
		String fileName = String.join("_", timestamp, uploadedFile.getFileName());

		advm.setName(fileName);
		
		Document document = new Document();
		document.setName(fileName);
		RegisterEsnService.getDoc(document);

		FileUploadUtils.uploadFileToApp(uploadedFile, fileName);
<<<<<<< HEAD
>>>>>>> b7c6b2a (user)
    }
	
    public DocumentType[] typesOfDocuments() {
    	return DocumentType.values();
    }
    
<<<<<<< HEAD
>>>>>>> 3d333c7 (user)
=======
=======
>>>>>>> a6ba52f (register esn ok)
	}

	public DocumentType[] typesOfDocuments() {
		return DocumentType.values();
	}

<<<<<<< HEAD
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> b7c6b2a (user)
=======
>>>>>>> a6ba52f (register esn ok)
	public AddDocumentViewModel getAdvm() {
		return advm;
	}

	public void setAdvm(AddDocumentViewModel advm) {
		this.advm = advm;
	}
}
