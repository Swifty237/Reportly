package fr.isika.cda23.projet3.repository.Activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Duty;

@Stateless
public class ActivityRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void create(Duty duty) {
		entityManager.persist(duty);
	}

	public List<Duty> listDuties() {
		return entityManager.createQuery("SELECT e FROM Duty e", Duty.class).getResultList();
	}

}
