package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.business.CustomerServices;
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class CustomerManagedBean {

	@Inject
	private CustomerServices customerServices;
	
	private CustomerViewModel customerVm = new CustomerViewModel();

	private List<Customer> listCustomers;
	
	@PostConstruct
	public void init() {
		listCustomers = customerServices.showAllCustomersService();	
	}
	
	public void registerCustomer() throws IOException{
		customerServices.registerCustomerService(customerVm);
		customerVm = new CustomerViewModel();
		NavigationUtils.redirectToUserList("showAllCustomers.xhtml");
	}
	
	public void deleteCustomer(Long id) throws IOException{
		customerServices.deleteCustomerService(id);
		NavigationUtils.redirectToUserList("showAllCustomers.xhtml");
	}

	public CustomerViewModel getCustomerVm() {
		return customerVm;
	}

	public void setCustomerVm(CustomerViewModel customerVm) {
		this.customerVm = customerVm;
	}
	
	public List<Customer> getListCustomers() {
		return listCustomers;
	}

	public void setListCustomers(List<Customer> listCustomers) {
		this.listCustomers = listCustomers;
	}
	
}