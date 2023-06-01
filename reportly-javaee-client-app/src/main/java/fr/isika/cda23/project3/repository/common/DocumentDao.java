package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.Document;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
=======
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
<<<<<<< HEAD
>>>>>>> 6f97582 (Renaming creating methods beans and viewModel -- suppression AddDocumentService DeleteDocumentService and corresponding beans and viewModels)
=======
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
=======
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
>>>>>>> ab3abe1 (register esn ok)
=======
import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.AddDocumentViewModel;
>>>>>>> 1289ec2 (register esn ok)
<<<<<<< HEAD
>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
import fr.isika.cda23.project3.business.RegisterEsnService;
>>>>>>> e2bb782 (Refactoring)
=======
import fr.isika.cda23.project3.business.RegisterEsnService;
>>>>>>> a6ba52f (register esn ok)

@Stateless
public class DocumentDao {

	@PersistenceContext
	private EntityManager entityManager;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

	public Long addDocument(AddDocumentViewModel advm) {

=======
	
	public Long addDocument(DocumentViewModel advm) {
<<<<<<< HEAD
		
>>>>>>> 6f97582 (Renaming creating methods beans and viewModel -- suppression AddDocumentService DeleteDocumentService and corresponding beans and viewModels)
=======
	
	public Long addDocument(DocumentViewModel advm) {
		
=======
	
	public Long addDocument(DocumentViewModel advm) {
		
>>>>>>> ab3abe1 (register esn ok)
=======

	public Long addDocument(AddDocumentViewModel advm) {

>>>>>>> 1289ec2 (register esn ok)
<<<<<<< HEAD
>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
	
	public Long addDocument(DocumentViewModel advm) {
		
>>>>>>> e2bb782 (Refactoring)
=======
>>>>>>> a6ba52f (register esn ok)
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
