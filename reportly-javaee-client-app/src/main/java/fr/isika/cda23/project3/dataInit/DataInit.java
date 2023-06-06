package fr.isika.cda23.project3.dataInit;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
}
}
	
