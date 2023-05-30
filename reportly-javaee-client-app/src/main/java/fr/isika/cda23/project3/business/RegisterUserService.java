package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
import fr.isika.cda23.project3.repository.user.UserDao;

@Stateless
public class RegisterUserService {
	
	@Inject
	private UserDao userDao;
	
	public Long register(RegisterUserViewModel registerUserVm) {
		return userDao.register(registerUserVm);
	}

}
