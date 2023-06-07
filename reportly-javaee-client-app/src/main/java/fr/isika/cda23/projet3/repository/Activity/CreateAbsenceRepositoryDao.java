package fr.isika.cda23.projet3.repository.Activity;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Absence;
import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda23.project3.presentation.viewModels.CreateAbsenceViewModel;



@Stateless
public class CreateAbsenceRepositoryDao {

	// injecter le composant entity Manager

	@PersistenceContext
	private EntityManager entityManager;

	public Long Create(CreateAbsenceViewModel viewModel) {

		// 1- creer mon entité
				Absence absence = new Absence();
				// 2- mapper le contenu du vm dans l'entité creee
				absence.setUserId(viewModel.getUserId());
				absence.setTypeOfAbsence(viewModel.getTypeAbsence());
				absence.setStartAt(viewModel.getStartAt());
				absence.setEndAt(viewModel.getEndAt());
				absence.setDescription(viewModel.getDescription());
				// 3- persister l'entité
				entityManager.persist(absence);
				return absence.getId();
	}

	public void removeCustomer(Absence absence) {

		entityManager.remove(absence);
		System.out.println("absence supprimé --------------------");
	}

	public void updateAbsence(Absence absence) {
		entityManager.merge(absence);
	}

	public List<Absence> findAbsenceByUserid(Long id) {

		return entityManager.createQuery("SELECT a FROM Absence a WHERE a.userId =:id", Absence.class).setParameter("id", id).getResultList();

	}


	

}

// 4- renvoyer
