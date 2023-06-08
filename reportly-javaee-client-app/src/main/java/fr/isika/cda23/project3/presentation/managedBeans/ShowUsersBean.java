package fr.isika.cda23.project3.presentation.managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.business.RegisterUserService;
import fr.isika.cda23.project3.utils.SessionUtils;

@ManagedBean
public class ShowUsersBean {

	@Inject
	private RegisterUserService rus;

	private List<Employee> accounts;

	@PostConstruct
	public void init() {
		System.out.println("id Esn++++++++++++" + SessionUtils.getEsnIdFromSession());

		if (SessionUtils.getEsnIdFromSession() != null) {
			accounts = rus.findAllUsers(SessionUtils.getEsnIdFromSession());
		} else {
			accounts = rus.findUsersByTeam(SessionUtils.getUserIdFromSession());
		}
	}

	public List<Employee> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Employee> accounts) {
		this.accounts = accounts;
	}

}