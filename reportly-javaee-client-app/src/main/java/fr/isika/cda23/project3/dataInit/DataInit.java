package fr.isika.cda23.project3.dataInit;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
		
//		Document document1 = new Document();
//		document1.setName("Document 1");
//		document1.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
//		document1.setDocCreation(new Date());
//		
//		Document document2 = new Document();
//		document2.setName("Document 2");
//		document2.setTypeOfDoc(DocumentType.SICK_LEAVE);
//		document2.setDocCreation(new Date());
//
//		Document document3 = new Document();
//		document3.setName("Document 3");
//		document3.setTypeOfDoc(DocumentType.OTHER_ACTIVITY);
//		document3.setDocCreation(new Date());
//		
//		em.persist(document1);
//		em.persist(document2);
//		em.persist(document3);


	}
}
