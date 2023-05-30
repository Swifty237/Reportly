package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.AddDocumentService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class AddDocumentManagedBean {

	@Inject
	private AddDocumentService adService;
	
	private AddDocumentViewModel advm = new AddDocumentViewModel();
	
	public void addDocument() throws Exception {
		adService.addDocument(advm);
		
		clear();
		
		NavigationUtils.redirectToUserList("documents/showAllDocuments.xhtml");
		
		System.out.println(advm.toString());
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
