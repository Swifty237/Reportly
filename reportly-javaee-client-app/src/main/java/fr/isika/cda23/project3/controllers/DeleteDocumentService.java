package fr.isika.cda23.project3.controllers;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.repository.common.DocumentDao;

@Stateless
public class DeleteDocumentService {

	@Inject
	private DocumentDao documentDao;
			
	public void deleteDoc(Long id) {
		Document doc = documentDao.findDocumentById(id);
		documentDao.removeDocument(doc);
	}
}
