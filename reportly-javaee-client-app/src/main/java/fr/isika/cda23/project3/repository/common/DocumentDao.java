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
=======
import fr.isika.cda23.projet3.repository.GenericDao;
>>>>>>> 8f765aa (Fixed some conflicts and integration errors + refactoring some classes)

@Stateless
public class DocumentDao extends GenericDao<Document, Long>{

	@PersistenceContext
	private EntityManager entityManager;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8f765aa (Fixed some conflicts and integration errors + refactoring some classes)

	public Long addDocument(AddDocumentViewModel advm) {

=======
	
	public Long addDocument(DocumentViewModel advm) {
<<<<<<< HEAD
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
=======
>>>>>>> 8f765aa (Fixed some conflicts and integration errors + refactoring some classes)
		Document document = new Document();
		document.setName(advm.getName());
		document.setTypeOfDoc(advm.getTypeOfDoc());
		document.setDocCreation(advm.getDocCreation());
		entityManager.persist(document);
		return document.getId();
	}

	public List<Document> findAllDocuments() {
		return entityManager.createQuery("SELECT d FROM Document d", Document.class).getResultList();
	}
}
