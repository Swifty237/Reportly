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
import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;
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
	private PersonalDetailsServices personalDetailsServices;
	
	@Inject
	private AdressDetailsServices adressDetailsServices;
	
	private CustomerViewModel customerVm = new CustomerViewModel();
	private AdressDetailsViewModel adressDetailsVm = new AdressDetailsViewModel();
	private CompanyDetailsViewModel companyDetailsVm = new CompanyDetailsViewModel();
	private PersonalDetailsViewModel personalDetailsVm = new PersonalDetailsViewModel();
	
	private List<Customer> listCustomers;
	
	
	@PostConstruct
	public void init() {
		listCustomers = customerServices.showAllCustomersService();	
	}
	
	public void registerCustomer() throws IOException{
		
		companyDetailsServices.registerCompanyDetails(customerVm, companyDetailsVm);
		personalDetailsServices.registerPersonalDetails(customerVm, personalDetailsVm);
		adressDetailsServices.registerAdressDetails(customerVm, adressDetailsVm);
		
		customerServices.registerCustomerService(customerVm);
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
	
	public PersonalDetailsViewModel getPersonalDetailsVm() {
		return personalDetailsVm;
	}

	public void setPersonalDetailsVm(PersonalDetailsViewModel personalDetailsVm) {
		this.personalDetailsVm = personalDetailsVm;
	}


	public CompanyDetailsViewModel getCompanyDetailsVm() {
		return companyDetailsVm;
	}

	public void setCompanyDetailsVm(CompanyDetailsViewModel companyDetailsVm) {
		this.companyDetailsVm = companyDetailsVm;
	}

	public AdressDetailsViewModel getAdressDetailsVm() {
		return adressDetailsVm;
	}

	public void setAdressDetailsVm(AdressDetailsViewModel adressDetailsVm) {
		this.adressDetailsVm = adressDetailsVm;
	}
}