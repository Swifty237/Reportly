package fr.isika.cda23.project3.dataInit;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.users.Employee;

@Singleton
@Startup
public class DataInit {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init() {
		System.out.println("haha");
		Employee emp=new Employee("jinz0920@yahoo.com","1010",300,"haha");
		em.persist(emp);
	}
	
}
