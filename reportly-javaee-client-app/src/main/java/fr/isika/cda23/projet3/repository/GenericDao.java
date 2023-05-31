package fr.isika.cda23.projet3.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Utilisation des générics Java (T, ID, E ...)
 * @param <T>
 * @param <ID>
 */
@Stateless
public class GenericDao<T, ID> {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(T entity) {
		entityManager.persist(entity);
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entity);
	}

	public T findById(ID id, Class<? extends T> clazz) {
		return entityManager.find(clazz, id);
	}

}
