package fr.isika.cda23.projet3.repository.Activity;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Absence;
import fr.isika.cda23.project3.presentation.viewModels.CreateAbsenceViewModel;



@Stateless
public class CreateAbsenceRepositoryDao {

	// injecter le composant entity Manager

	@PersistenceContext
	private EntityManager entityManager;

	public String Create(CreateAbsenceViewModel viewModel) {

		// 1- creer mon entité
		Absence absence = new Absence();

		// 2- mapper le contenu du vm dans l'entité creee

		absence.setStartAt(viewModel.getStartAt());
		absence.setEndAt(viewModel.getEndAt());
		absence.setDescription(viewModel.getDescription());

		// 3- persister l'entité

		entityManager.persist(absence);
		return "ok";
	}

	public void removeCustomer(Absence absence) {

		entityManager.remove(absence);
		System.out.println("absence supprimé --------------------");
	}

	public void updateAbsence(Absence absence) {
		entityManager.merge(absence);
	}

	public Absence findAbsenceById(Long id) {

		return entityManager.find(Absence.class, id);

	}

	public List<Absence> findAllabsence() {
		return entityManager.createQuery("SELECT ", Absence.class).getResultList();
	}

}

// 4- renvoyer