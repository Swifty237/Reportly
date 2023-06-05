package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
<<<<<<< HEAD
import fr.isika.cda23.project3.business.CompanyDetailsServices;
import fr.isika.cda23.project3.business.CustomerServices;
import fr.isika.cda23.project3.business.PersonalDetailsServices;
<<<<<<< HEAD
=======
import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
>>>>>>> db8741c (Customer register - Work in progress : refactoring)
=======
import fr.isika.cda23.project3.business.CustomerServices;
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class CustomerManagedBean {

	@Inject
	private CustomerServices customerServices;
	
<<<<<<< HEAD
	@Inject
	private CompanyDetailsServices companyDetailsServices;
	
	@Inject
	private PersonalDetailsServices personalDetailsServices;
	
	@Inject
<<<<<<< HEAD
	private PersonalDetailsBean personalDetailsBean;
		
=======
	private AdressDetailsServices adressDetailsServices;
	
>>>>>>> db8741c (Customer register - Work in progress : refactoring)
=======
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
	private CustomerViewModel customerVm = new CustomerViewModel();

	private List<Customer> listCustomers;
	
	@PostConstruct
	public void init() {
		listCustomers = customerServices.showAllCustomersService();	
	}
	
	public void registerCustomer() throws IOException{
<<<<<<< HEAD
		
<<<<<<< HEAD
		System.out.println("register adress ===========================================================================================================");
		companyDetailsBean.registerAdressDetail();
=======
		companyDetailsServices.registerCompanyDetails(customerVm, companyDetailsVm);
		personalDetailsServices.registerPersonalDetails(customerVm, personalDetailsVm);
		adressDetailsServices.registerAdressDetails(customerVm, adressDetailsVm);
>>>>>>> db8741c (Customer register - Work in progress : refactoring)
		
		System.out.println("register company Details ===========================================================================================================");
		companyDetailsServices.registerCompanyDetails(customerVm, companyDetailsBean.getCompanyDetailsVm());
		System.out.println("register Personal Details ===========================================================================================================");
		personalDetailsServices.registerPersonalDetails(customerVm, personalDetailsBean.getPersonalDetailsVm());
		
		System.out.println("register Customer ===========================================================================================================");
=======
>>>>>>> b07525c (Refactoring register customer ok -- to be checked and tested)
		customerServices.registerCustomerService(customerVm);
		System.out.println("register clear ===========================================================================================================");
//		customerVm = new CustomerViewModel();
		
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