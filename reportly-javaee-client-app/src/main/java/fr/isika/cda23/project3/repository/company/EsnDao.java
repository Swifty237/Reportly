package fr.isika.cda23.project3.repository.company;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.esn.Esn;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
=======
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
>>>>>>> 84f94f9 (register esn ok)
=======
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
>>>>>>> ab3abe1 (register esn ok)
=======
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
>>>>>>> a6ba52f (register esn ok)
=======
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
>>>>>>> b72d5bc (ecranEsn)

public class EsnDao {

	@PersistenceContext
	private EntityManager entityManager;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
//	Enregistrer un user
>>>>>>> 84f94f9 (register esn ok)
=======
//	Enregistrer un user
>>>>>>> ab3abe1 (register esn ok)
=======
//	Enregistrer un user
>>>>>>> a6ba52f (register esn ok)
	public Long register(Esn esn) {
//		 - persister l'entité
		entityManager.persist(esn);

		// - renvoyer son id (ici qui devrait être généré auto, après le persist)
		return esn.getId();
	}

	public CompanyDetails findByEmail(LoginViewModel loginViewModel) {
		try {
			return entityManager
					.createQuery(
							"SELECT u FROM CompanyDetails u WHERE u.email = :emailParam AND u.password = :pwdParam",
							CompanyDetails.class)
					.setParameter("emailParam", loginViewModel.getEmail())
					.setParameter("pwdParam", loginViewModel.getPassword()).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b72d5bc (ecranEsn)
	public Long getESNIdByEmail(String email) {
		try {
			return entityManager
					.createQuery("SELECT esn.id FROM Esn esn WHERE esn.companyDetails.email = :email", Long.class)
					.setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	public Esn getEsnById(Long id) {
		try {
			return entityManager
					.createQuery("SELECT esn FROM Esn esn WHERE esn.id = :id", Esn.class)
					.setParameter("id", id).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
<<<<<<< HEAD
=======
>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> a6ba52f (register esn ok)
=======
>>>>>>> b72d5bc (ecranEsn)
}
