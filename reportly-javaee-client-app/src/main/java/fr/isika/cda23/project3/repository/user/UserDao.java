package fr.isika.cda23.project3.repository.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;
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
