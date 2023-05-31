package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.repository.Contract.CustomerDao;

@Stateless
public class DeleteCustomerService {

	@Inject
	private CustomerDao customerDao;
	
	public void deleteCustomer(Long id) {
		Customer customer = customerDao.findCustomerById(id);
		customerDao.removeCustomer(customer);
		
	}
}
