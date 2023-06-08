package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Cra;

@Stateless
public class CraRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long persist(Cra cra) {
		entityManager.persist(cra);
		return cra.getId();
	}


	public Cra findById(Long id) {
		return entityManager.find(Cra.class, id);
	}

}
