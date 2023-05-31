package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Cra;

@Stateless
public class CraDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long persist(Cra cra) {
		entityManager.persist(cra);
		return cra.getId();
	}

	public void update(Cra cra) {
		entityManager.merge(cra);
	}

	public void remove(Cra cra) {
		entityManager.remove(cra);
	}

	public Cra findById(Long id) {
		return entityManager.find(Cra.class, id);
	}

}
