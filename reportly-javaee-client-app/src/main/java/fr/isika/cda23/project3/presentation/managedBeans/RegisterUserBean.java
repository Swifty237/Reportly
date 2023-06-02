package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda.entities.users.UserRole;
import fr.isika.cda23.project3.business.RegisterUserService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
import fr.isika.cda23.project3.repository.company.EsnDao;
import fr.isika.cda23.project3.utils.NavigationUtils;
import fr.isika.cda23.project3.utils.SessionUtils;

@ManagedBean
@SessionScoped
public class RegisterUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3387805047890727084L;

	@Inject
	private RegisterUserService ruService;

	@Inject
	private EsnDao esnDao;

	private RegisterUserViewModel registerUserVm = new RegisterUserViewModel();

	private Employee user;

// enregistre l'user
	public void register() throws IOException {
		Esn esn = esnDao.getEsnById(SessionUtils.getEsnIdFromSession());
		registerUserVm.setEsn(esn);

//		on vérifie si registerUserVm.getUserId()==0 si oui on crée un nouveau user, sinon on le modifie
		if (registerUserVm.getUserId() == 0) {

			ruService.register(registerUserVm);
		} else {

			ruService.modifyUser(registerUserVm);
		}

		registerUserVm = new RegisterUserViewModel();

		NavigationUtils.redirectToUserList("ecranEsn.xhtml");

	}

//	avoir les infos de l'user dans un formulaire register
	public void viewUser(long userId) throws IOException {
		UserAccount userAccount = ruService.findOneUser(userId);
		user = (Employee) userAccount;
		registerUserVm.setUserId(userId);
		registerUserVm.setName(user.getPers().getName());
		registerUserVm.setFirstname(user.getPers().getFirstname());
		registerUserVm.setEmail(user.getEmail());
		registerUserVm.setPassword(user.getPassword());
		registerUserVm.setBirthday(user.getPers().getBirthday());
		registerUserVm.setAdress(user.getPers().getAdressDetails().getAdress());
		registerUserVm.setCity(user.getPers().getAdressDetails().getCity());
		registerUserVm.setCountry(user.getPers().getAdressDetails().getCountry());
		registerUserVm.setPostalCode(user.getPers().getAdressDetails().getPostalCode());
		registerUserVm.setPhoneNumber(user.getPers().getPhoneNumber());
		registerUserVm.setJobTitle(user.getPers().getJobTitle());
		registerUserVm.setTjm(user.getTjm());
		registerUserVm.setUserRole(user.getUserRole());
		NavigationUtils.redirectToUserList("register.xhtml");

	}

	public UserRole[] typesOfRoles() {
		return UserRole.values();
	}

//	clear tous les champs du formulaire de register
	public void clear() {
<<<<<<< HEAD
		registerUserVm = new RegisterUserViewModel();
		try {
			NavigationUtils.redirectToUserList("ecranEsn.xhtml");
		} catch (IOException e) {
=======
		try {
			if (registerUserVm == null) {

				System.out.println("lolo++++++++++++++++++++++++++++++++++++++++++");
				NavigationUtils.redirectToUserList("ecranEsn.xhtml");
			} else {
				registerUserVm = new RegisterUserViewModel();
				NavigationUtils.redirectToUserList("ecranEsn.xhtml");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
>>>>>>> b72d5bc (ecranEsn)
			e.printStackTrace();
		}
	}

	public void deleteUser(long id) throws IOException {
		ruService.deleteUser(id);
		NavigationUtils.redirectToUserList("ecranEsn.xhtml");
	}

	public RegisterUserViewModel getRegisterUserVm() {
		return registerUserVm;
	}

	public void setRegisterUserVm(RegisterUserViewModel registerUserVm) {
		this.registerUserVm = registerUserVm;
	}
}
