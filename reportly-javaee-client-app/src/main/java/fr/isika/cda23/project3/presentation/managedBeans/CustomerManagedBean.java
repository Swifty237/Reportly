package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.business.AdressDetailsServices;
import fr.isika.cda23.project3.business.CompanyDetailsServices;
import fr.isika.cda23.project3.business.CustomerServices;
import fr.isika.cda23.project3.business.PersonalDetailsServices;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class CustomerManagedBean {


	@Inject
	private CustomerServices customerServices;
	
	@Inject
	private CompanyDetailsServices companyDetailsServices;
	
	@Inject
	private CompanyDetailsBean companyDetailsBean;
	
	@Inject
	private PersonalDetailsServices personalDetailsServices;
	
	@Inject
	private PersonalDetailsBean personalDetailsBean;
		
	private CustomerViewModel customerVm = new CustomerViewModel();
	
	private List<Customer> listCustomers;
	
	@PostConstruct
	public void init() {
		listCustomers = customerServices.showAllCustomersService();	
	}
	
	public void registerCustomer() throws IOException{
		
		System.out.println("register adress ===========================================================================================================");
		companyDetailsBean.registerAdressDetail();
		
		System.out.println("register company Details ===========================================================================================================");
		companyDetailsServices.registerCompanyDetails(customerVm, companyDetailsBean.getCompanyDetailsVm());
		System.out.println("register Personal Details ===========================================================================================================");
		personalDetailsServices.registerPersonalDetails(customerVm, personalDetailsBean.getPersonalDetailsVm());
		
		System.out.println("register Customer ===========================================================================================================");
		customerServices.registerCustomerService(customerVm);
		System.out.println("register clear ===========================================================================================================");
		customerVm = new CustomerViewModel();
		
		NavigationUtils.redirectToUserList("showAllCustomers.xhtml");
	}
	
	
	public void deleteCustomer(Long id) throws IOException{
		customerServices.deleteCustomerService(id);
		NavigationUtils.redirectToUserList("showAllCustomer.Xhtml");
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