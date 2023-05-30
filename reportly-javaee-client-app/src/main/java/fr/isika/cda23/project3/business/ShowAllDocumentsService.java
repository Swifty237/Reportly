package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.repository.common.DocumentDao;

@Stateless
public class ShowAllDocumentsService {

	@Inject
	private DocumentDao documentDao;
	
	public List<Document> showAllDocuments() {
		return documentDao.findAllDocuments();
	}
}
