package fr.isika.cda23.project3.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;
import fr.isika.cda23.project3.repository.user.UserDao;

@Stateless
public class RegisterUserService {

	@Inject
	private UserDao userDao;

	public void register(RegisterUserViewModel viewModel) {
		Employee emp = new Employee();
		emp.setEmail(viewModel.getEmail());
		emp.setPassword(viewModel.getPassword());
		emp.setTjm(viewModel.getTjm());

		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(viewModel.getAdress());
		adressDetails.setCity(viewModel.getCity());
		adressDetails.setCountry(viewModel.getCountry());
		adressDetails.setPostalCode(viewModel.getPostalCode());

		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setName(viewModel.getName());
		personalDetails.setFirstname(viewModel.getFirstname());
		personalDetails.setBirthday(viewModel.getBirthday());
		personalDetails.setJobTitle(viewModel.getJobTitle());
		personalDetails.setPhoneNumber(viewModel.getPhoneNumber());
		personalDetails.setAdressDetails(adressDetails);

		emp.setPers(personalDetails);

		viewModel.setEmp(emp);

		Long id = userDao.register(viewModel);
	}

	public List<UserAccount> findAllUsers() {
		return userDao.findAllUsers();
	}

	public UserAccount findOneUser(long id) {
		return userDao.findOneUser(id);
	}

//	modify un user avec viewmodel saisi depuis le front
	public void modifyUser(RegisterUserViewModel registerUserVm) {
		UserAccount user = userDao.findOneUser(registerUserVm.getUserId());
		if (user instanceof Employee) {
			Employee employee = (Employee) user;
			employee.getPers().setName(registerUserVm.getName());
			employee.getPers().setFirstname(registerUserVm.getFirstname());
			employee.setEmail(registerUserVm.getEmail());
			employee.setPassword(registerUserVm.getPassword());
			employee.getPers().setBirthday(registerUserVm.getBirthday());
			employee.getPers().getAdressDetails().setAdress(registerUserVm.getAdress());
			employee.getPers().getAdressDetails().setCity(registerUserVm.getCity());
			employee.getPers().getAdressDetails().setPostalCode(registerUserVm.getPostalCode());
			employee.getPers().getAdressDetails().setCountry(registerUserVm.getCountry());
			employee.getPers().setPhoneNumber(registerUserVm.getPhoneNumber());
			employee.getPers().setJobTitle(registerUserVm.getJobTitle());
			employee.setTjm(registerUserVm.getTjm());
			userDao.modifyUser(employee);
		}

	}

	public void deleteUser(long id) {
		UserAccount user = userDao.findOneUser(id);
		userDao.deleteUser(user);

	}

}
