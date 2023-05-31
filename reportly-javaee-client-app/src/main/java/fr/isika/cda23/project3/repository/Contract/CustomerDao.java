package fr.isika.cda23.project3.repository.Contract;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.isika.cda.entities.contract.Customer;

import fr.isika.cda23.project3.presentation.viewModels.RegisterCustomerViewModel;


public class CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long register(RegisterCustomerViewModel rcvm) {
		
		Customer customer = new Customer();
		
		customer.setCompanyDetails(rcvm.getCompanyDetails());
		customer.setPersonalDetails(rcvm.getPersonalDetails());
		
		entityManager.persist(customer);
		
		System.out.println("Customer : " + rcvm.toString() + " persisté");
		
		return customer.getId();
		
	}
	
	public void removeCustomer(Customer customer) {
		
		entityManager.remove(customer);
		 System.out.println("Client supprimé --------------------");
	}
	
	public void updateCustomer (Customer customer) {
		entityManager.merge(customer);
	}
	
	public Customer findCustomerById(Long id) {
		
		return entityManager.find(Customer.class, id);
		
	}
	
	public List<Customer> findAllCustomer(){
		return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

}
