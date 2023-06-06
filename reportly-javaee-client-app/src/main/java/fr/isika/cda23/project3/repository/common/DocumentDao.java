package fr.isika.cda23.project3.repository.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda23.project3.presentation.viewModels.DocumentViewModel;
import fr.isika.cda23.projet3.repository.GenericDao;

@Stateless
public class DocumentDao extends GenericDao<Document, Long>{

	@PersistenceContext
	private EntityManager entityManager;

	public Long addDocument(DocumentViewModel advm) {
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
