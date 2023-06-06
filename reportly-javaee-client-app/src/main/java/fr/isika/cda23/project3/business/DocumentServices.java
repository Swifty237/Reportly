package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
//import fr.isika.cda23.project3.repository.common.DocumentDao;

@Stateless
public class DocumentServices {

//	@Inject
//	private DocumentDao documentDao;
//	
//	public void addDocumentService(DocumentViewModel docVm) {
//		Long id = documentDao.addDocument(docVm);
//		System.out.println("Document avec id : " + id + "enregistré");
//	}
//	
//	public void deleteDocumentService(Long id) {
//		Document doc = documentDao.findDocumentById(id);
//		documentDao.removeDocument(doc);
//	}
//	
//	public List<Document> showAllDocumentsService() {
//		return documentDao.findAllDocuments();
//	}
}
