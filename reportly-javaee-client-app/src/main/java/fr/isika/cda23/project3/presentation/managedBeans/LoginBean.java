package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.SessionUtils;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 746175328364105291L;
	
	@Inject
	private UserDao userDao;
	
	private LoginViewModel loginViewModel = new LoginViewModel();
	
	public String login() {
		// vérifier que le vm contient des données valides
		if(!loginViewModel.isValid()) {
			return "";
		}
		
		// vérifier que le user existe en bdd
		UserAccount account = userDao.findByEmail(loginViewModel);
		if(account != null) {
			SessionUtils.setUserEmailIntoSession(account.getEmail());
			return "index.xhtml";
		}
		
		// Rester sur la même page pour afficher les erreurs
		return "";
	}
	
	public String logout() {
		// vider le vm
		loginViewModel = new LoginViewModel();
		// vider la session http
		SessionUtils.resetSession();
		return "index.xhtml";
	}
	
	public boolean isUserLoggedIn() {
		return SessionUtils.isUserLoggedIn();
	}
	
	public LoginViewModel getLoginViewModel() {
		return loginViewModel;
	}
	public void setLoginViewModel(LoginViewModel loginViewModel) {
		this.loginViewModel = loginViewModel;
	}
}
