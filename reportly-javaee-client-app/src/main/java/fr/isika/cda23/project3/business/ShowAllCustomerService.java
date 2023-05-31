package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.repository.Contract.CustomerDao;

@Stateless
public class ShowAllCustomerService {

	@Inject
	private CustomerDao customerDao;
	
	public List<Customer> showAllCustomers(){
		return customerDao.findAllCustomer();
	}
}
