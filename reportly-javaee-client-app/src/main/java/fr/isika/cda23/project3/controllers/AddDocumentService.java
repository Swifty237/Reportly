package fr.isika.cda23.project3.controllers;

import javax.ejb.Stateless;
import javax.inject.Inject;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
import fr.isika.cda23.project3.repository.common.DocumentDao;

@Stateless
public class AddDocumentService {

	@Inject
	private DocumentDao documentDao;
	
	public void addDocument(AddDocumentViewModel advm) {
		Long id = documentDao.addDocument(advm);
		System.out.println("Document avec id : " + id + "enregistré");
	}
}
