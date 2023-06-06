package fr.isika.cda23.project3.repository.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;

public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

//	Enregistrer un user
	public Long register(RegisterUserViewModel viewModel) {
//		 - persister l'entité
		entityManager.persist(viewModel.getEmp());

		// - renvoyer son id (ici qui devrait être généré auto, après le persist)
		return viewModel.getEmp().getUserId();
	}

//	Select all users dans une list
	public List<UserAccount> findAllUsers() {
		return entityManager.createQuery("SELECT u FROM UserAccount u", UserAccount.class).getResultList();

	}

	public UserAccount findByEmail(LoginViewModel loginViewModel) {
		try {
		return entityManager
				.createQuery("SELECT u FROM UserAccount u WHERE u.email = :emailParam AND u.password = :pwdParam", UserAccount.class)
				.setParameter("emailParam", loginViewModel.getEmail())
				.setParameter("pwdParam", loginViewModel.getPassword())
				.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}
	public UserAccount findByEmail(final String email) {
		try {
			return entityManager
					.createQuery("SELECT u FROM UserAccount u WHERE u.email = :emailParam", UserAccount.class)
					.setParameter("emailParam", email)
					.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}
	
//	find un user avec son id 
	public UserAccount findOneUser(long id) {
		return entityManager.find(UserAccount.class, id);
	}

	public void modifyUser(UserAccount user) {
		entityManager.merge(user);
	}

	public void deleteUser(UserAccount user) {
		entityManager.remove(user);
		
	}
}
