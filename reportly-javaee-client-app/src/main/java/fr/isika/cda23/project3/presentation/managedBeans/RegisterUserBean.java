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

	// Première méthode à appeler depuis la vue
	public void register() {
		ruService.register(registerUserVm);

		// après le register je vais réinitialiser le modèle du formulaire
		clear();
		
		System.out.println(registerUserVm.toString());
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
