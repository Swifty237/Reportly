package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Activity;

@Stateless
public class ActivityRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ActivityRepositoryDao activityDao) {
		entityManager.persist(activityDao);
	}

	public void update(ActivityRepositoryDao activityDao) {
		entityManager.merge(activityDao);
	}

	public void remove(ActivityRepositoryDao activityDao) {
		entityManager.remove(activityDao);
	}

	public Activity findById(Long id) {
		return entityManager.find(Activity.class, id);
	}

}
