package fr.isika.cda23.project3.business;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.presentation.managedBeans.CompanyDetailsBean;
import fr.isika.cda23.project3.presentation.managedBeans.PersonalDetailsBean;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;
import fr.isika.cda23.project3.repository.Contract.CustomerDao;
import fr.isika.cda23.project3.repository.common.CompanyDetailsDao;
import fr.isika.cda23.project3.repository.common.PersonalDetailsDao;

@Stateless
public class CustomerServices {

	@Inject
	private CustomerDao customerDao;
		
	public void registerCustomerService(CustomerViewModel cvm) {
				
		Long id = customerDao.register(cvm);
	}
	
	public void deleteCustomerService(Long id) {
		Customer customer = customerDao.findCustomerById(id);
		customerDao.removeCustomer(customer);	
	}
	
	public List<Customer> showAllCustomersService() {
		return customerDao.findAllCustomer();
	}
	
	public Date getCreationDateService(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getCreationDate();
	}
	
	public String getBrandService(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getBrand();
	}
	
	public String getEmailService(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getEmail();
	}
	
	public String getAdress(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getAdressDetails().getAdress();
	}
	
	public String getPostalCode(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getAdressDetails().getPostalCode();
	}
	
	public String getCity(Long id) {
		return customerDao.findCustomerById(id).getCompanyDetails().getAdressDetails().getCity();
	}
}
