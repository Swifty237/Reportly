package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Duty;

@Stateless
public class DutyRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long persist(Duty duty) {

		entityManager.persist(duty);
		return duty.getId();

	}

	public void update(Duty duty) {
		entityManager.merge(duty);

	}

	public void remove(Duty duty) {

		entityManager.remove(duty);
	}

	public Duty findById(Long id) {

		return entityManager.find(Duty.class, id);

	}

}