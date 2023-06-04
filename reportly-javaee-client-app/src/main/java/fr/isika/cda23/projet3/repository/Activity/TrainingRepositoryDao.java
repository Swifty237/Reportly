package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TrainingRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TrainingRepositoryDao trainingDao) {
		entityManager.persist(trainingDao);
	}

	public void update(TrainingRepositoryDao trainingDao) {
		entityManager.merge(trainingDao);
	}

	public void remove(TrainingRepositoryDao trainingDao) {
		entityManager.remove(trainingDao);
	}

	public TrainingRepositoryDao findById(Long id) {
		return entityManager.find(TrainingRepositoryDao.class, id);
	}

}
