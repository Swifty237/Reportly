package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
import fr.isika.cda23.project3.repository.common.DocumentDao;

@Stateless
public class DocumentServices {

	@Inject
	private DocumentDao documentDao;
	
	public void addDocumentService(DocumentViewModel docVm) {
		documentDao.addDocument(docVm);
	}
	
	public void deleteDocumentService(Long id) {
		Document doc = documentDao.findById(id, Document.class);
		documentDao.remove(doc);
	}
	
	public List<Document> showAllDocumentsService() {
		return documentDao.findAllDocuments();
	}
}
