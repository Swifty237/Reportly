package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.project3.presentation.viewModels.RegisterCraViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
import fr.isika.cda23.project3.repository.user.UserDao;

@Stateless
public class RegisterCraService {

	

		@Inject
		private CraDao CraDao ;
		
		public void register(RegisterCraViewModel registerCraVm) {
			Long id = CraDao.register(registerCraVm);
			System.out.println("Created cra with id : " + id);
		}

	}


