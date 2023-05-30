package fr.isika.cda23.project3.presentation.managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.business.ShowAllDocumentsService;
import fr.isika.cda23.project3.repository.common.DocumentDao;

@ManagedBean
public class ShowAllDocumentsManagedBean {

	@Inject
	private ShowAllDocumentsService sadService;
	
	private List<Document> listDocs;
	
	@PostConstruct
	public void init() {
		listDocs = sadService.showAllDocuments();
	}

	public List<Document> getListDocs() {
		return listDocs;
	}

	public void setListDocs(List<Document> listDocs) {
		this.listDocs = listDocs;
	}
}
