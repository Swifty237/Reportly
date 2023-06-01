package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.Document;
<<<<<<< HEAD
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
=======
import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
>>>>>>> 1289ec2 (register esn ok)

@Stateless
public class DocumentDao {

	@PersistenceContext
	private EntityManager entityManager;
<<<<<<< HEAD
	
	public Long addDocument(DocumentViewModel advm) {
		
=======

	public Long addDocument(AddDocumentViewModel advm) {

>>>>>>> 1289ec2 (register esn ok)
		Document document = new Document();

		document.setName(advm.getName());
		document.setTypeOfDoc(advm.getTypeOfDoc());
		document.setDocCreation(advm.getDocCreation());
		entityManager.persist(document);

		System.out.println("Document : " + advm.toString() + " persisté");

		return document.getId();
	}

	public void removeDocument(Document document) {
		entityManager.remove(document);
		System.out.println("Document supprimé ================================================");
	}

	public void updateDocument(Document document) {
		// A faire en fonction de la propriété (ou des propriétés) qu'on aura besoin de
		// modifier
	}

	public Document findDocumentById(Long id) {
		return entityManager.find(Document.class, id);
	}

	public List<Document> findAllDocuments() {
		return entityManager.createQuery("SELECT d FROM Document d", Document.class).getResultList();
	}
}
