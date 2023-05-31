package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import fr.isika.cda23.project3.business.AddDocumentService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class AddDocumentManagedBean {

	@Inject
	private AddDocumentService adService;
	
	private AddDocumentViewModel advm = new AddDocumentViewModel();
	
//	private String uploadDirectory = "/chemin/vers/repertoire/destination";
	
//	public void addDocument() throws Exception {
//		adService.addDocument(advm);
//		clear();
//		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
//	}
	
    public void uploadFile(FileUploadEvent event) throws Exception {
    	
        UploadedFile uploadedFile = event.getFile();
        String fileName = uploadedFile.getFileName();
        
        advm.setName(fileName);
        
		adService.addDocument(advm);
		clear();
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");

        // Enregistrez le fichier dans votre répertoire webapp/resources/documents
        String targetFolder = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources/documents/");
        
        try (InputStream inputStream = uploadedFile.getInputStream()) {
          Files.copy(inputStream, Paths.get(targetFolder, fileName), StandardCopyOption.REPLACE_EXISTING);
          
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
	
	public void clear() {
		advm = new AddDocumentViewModel();
	}

	public AddDocumentViewModel getAdvm() {
		return advm;
	}

	public void setAdvm(AddDocumentViewModel advm) {
		this.advm = advm;
	}
}
