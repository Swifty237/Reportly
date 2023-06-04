package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.OtherActivity;

@Stateless
public class OtherActivityDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OtherActivityDao otherActivityDao) {
		entityManager.persist(otherActivityDao);
	}

	public void update(OtherActivityDao otherActivityDao) {
		entityManager.merge(otherActivityDao);
	}

	public void remove(OtherActivityDao otherActivityDao) {
		entityManager.remove(otherActivityDao);
	}

	public OtherActivity findById(Long id) {
		return entityManager.find(OtherActivity.class, id);
	}

}