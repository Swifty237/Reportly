package fr.isika.cda23.project3.repository.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;


public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Long register(RegisterUserViewModel viewModel) {
		
		// 1 - Créer mon entité UserAccount
		UserAccount account = new UserAccount();
		
		// 2 - Mapper le contenu du vm dans l'entité
//		account.setUsername(viewModel.getUsername());
		account.setPassword(viewModel.getPassword());

		
		// 3 - persister l'entité
		entityManager.persist(account);
		
		// 4 - renvoyer son id (ici qui devrait être généré auto, après le persist)
		return account.getUserId();
	}
}
