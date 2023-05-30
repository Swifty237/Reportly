package fr.isika.cda23.project3.presentation.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.RegisterUserService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;


@ManagedBean
public class RegisterUserBean {

	@Inject
	private RegisterUserService ruService;

	private RegisterUserViewModel registerUserVm = new RegisterUserViewModel();

	public String register() {
		Long id = ruService.register(registerUserVm);
		if(id != null) {
			
			clear();
			
			System.out.println("User registered with id = " + id);
			System.out.println("redirecting to login .....");
			
			// Si le user est créé faudra rediriger vers login page
			return "login";
		}
		
		// On reste sur la même page si le user n'a pas été créé (pour X raisons ?)
		return "";
	}

	// Effacer les champs du view model
	// => effacer les champs du formulaires
	// qui sont "associés" à ces attributs
	public void clear() {
		registerUserVm = new RegisterUserViewModel();
	}

	/*
	 * 
	 */
	public RegisterUserViewModel getRegisterUserVm() {
		return registerUserVm;
	}

	public void setRegisterUserVm(RegisterUserViewModel registerUserVm) {
		this.registerUserVm = registerUserVm;
	}
}
