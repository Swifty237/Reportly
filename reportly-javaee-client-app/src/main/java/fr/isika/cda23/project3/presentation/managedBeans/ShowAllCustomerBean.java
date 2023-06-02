package fr.isika.cda23.project3.presentation.managedBeans;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.business.ShowAllCustomerService;

@ManagedBean
public class ShowAllCustomerBean {
	@Inject
	private ShowAllCustomerService sacService;
	
	private List<Customer> listCustomers;
	
	@PostConstruct
	public void init() {
	listCustomers = sacService.showAllCustomers();	
	}

	public List<Customer> getListCustomers() {
		return listCustomers;
	}


	public void setListCustomers(List<Customer> listCustomers) {
		this.listCustomers = listCustomers;
	}
	
	

}
