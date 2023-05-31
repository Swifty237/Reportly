package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TrainingDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TrainingDao trainingDao) {
		entityManager.persist(trainingDao);
	}

	public void update(TrainingDao trainingDao) {
		entityManager.merge(trainingDao);
	}

	public void remove(TrainingDao trainingDao) {
		entityManager.remove(trainingDao);
	}

	public TrainingDao findById(Long id) {
		return entityManager.find(TrainingDao.class, id);
	}

}
