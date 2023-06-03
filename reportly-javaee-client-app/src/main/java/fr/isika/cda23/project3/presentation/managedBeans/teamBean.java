package fr.isika.cda23.project3.presentation.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.SessionUtils;

@ManagedBean
public class teamBean {

	@Inject
	private UserDao userDao;

	private List<String> managerNames = new ArrayList<>();

	@PostConstruct
	public void init() {
		List<UserAccount> accounts = userDao.getManagerNotBusy(SessionUtils.getEsnIdFromSession());
		
		for (UserAccount manager : accounts) {
		    PersonalDetails personalDetails = manager.getPers();
		    String firstName = personalDetails.getFirstname();
		    String lastName = personalDetails.getName();
		    String fullName = firstName + " " + lastName;
		    managerNames.add(fullName);
		}

	}

	public List<String> getManagerNames() {
		return managerNames;
	}

	public void setManagerNames(List<String> managerNames) {
		this.managerNames = managerNames;
	}
	
}
