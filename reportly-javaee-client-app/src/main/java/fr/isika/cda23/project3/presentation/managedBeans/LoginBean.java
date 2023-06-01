package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.LoginViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.NavigationUtils;
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

	@Inject
	private EsnDao esnDao;

	private LoginViewModel loginViewModel = new LoginViewModel();

	public String login() {
		// vérifier que le vm contient des données valides
		if (!loginViewModel.isValid()) {
			return "";
		}

		// vérifier que le user existe en bdd
		UserAccount account = userDao.findByEmail(loginViewModel);
		if (account != null) {
			System.out.println("user ok");
			SessionUtils.setUserEmailIntoSession(account.getEmail());
			return "index.xhtml";
		} else {
			CompanyDetails esn = esnDao.findByEmail(loginViewModel);
			if (esn != null) {
				System.out.println("esn ok");
				SessionUtils.setUserEmailIntoSession(esn.getEmail());
				return "index.xhtml";
			}
			System.out.println("not login 1");
		}
		System.out.println("not login 2");
		// Rester sur la même page pour afficher les erreurs
		return "";
	}

	public void logout() throws IOException {
		// vider le vm
		loginViewModel = new LoginViewModel();
		// vider la session http
		SessionUtils.resetSession();
		
		NavigationUtils.redirectToUserList("index.xhtml");
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