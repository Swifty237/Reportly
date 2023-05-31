package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;


import fr.isika.cda23.project3.presentation.viewModels.RegisterCustomerViewModel;
import fr.isika.cda23.project3.repository.Contract.CustomerDao;


@Stateless
public class RegisterCustomerService {
	
	@Inject
	private CustomerDao customerDao;
	

	public void registerCustomer(RegisterCustomerViewModel rcvm) {
		Long id = customerDao.register(rcvm);
		
	}

}
