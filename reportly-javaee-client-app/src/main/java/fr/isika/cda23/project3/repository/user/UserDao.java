package fr.isika.cda23.project3.repository.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda.entities.users.UserRole;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
import fr.isika.cda23.project3.utils.SessionUtils;

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
	public List<UserAccount> findAllUsers(Long id) {
		return entityManager.createQuery("SELECT ua FROM UserAccount ua WHERE ua.esn.id = :id", UserAccount.class)
				.setParameter("id", id).getResultList();

	}

	public UserAccount findByEmail(LoginViewModel loginViewModel) {
		try {
			return entityManager
					.createQuery("SELECT u FROM UserAccount u WHERE u.email = :emailParam AND u.password = :pwdParam",
							UserAccount.class)
					.setParameter("emailParam", loginViewModel.getEmail())
					.setParameter("pwdParam", loginViewModel.getPassword()).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

//	find un user avec son id 
	public UserAccount findOneUser(long id) {
		return entityManager.find(UserAccount.class, id);
	}

//	find all Manager not busy with EsnId
	public List<Employee> getManagerNotBusy(Long id) {
		try {
			return entityManager.createQuery(
					"SELECT u FROM Employee u JOIN u.esn e WHERE u.userRole = :role AND u.busy = :busy AND e.id = :id",
					Employee.class).setParameter("role", UserRole.TEAM_MANAGER).setParameter("busy", false)
					.setParameter("id", id).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public void modifyUser(UserAccount user) {
		entityManager.merge(user);
	}
	public Long modifyEmployee(Employee emp) {
		entityManager.merge(emp);
		
		return emp.getUserId();
	}

	public void deleteUser(UserAccount user) {
		entityManager.remove(user);

	}
}
