package fr.isika.cda23.project3.repository.Contract;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda23.project3.presentation.viewModels.CustomerViewModel;

public class CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long register(CustomerViewModel cvm) {

		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setBrand(cvm.getCompanyDetailsVm().getBrand());
		companyDetails.setCreationDate(cvm.getCompanyDetailsVm().getCreationDate());
		companyDetails.setEmail(cvm.getCompanyDetailsVm().getEmail());

		AdressDetails adressDetails = new AdressDetails();
		adressDetails.setAdress(cvm.getAdressDetailsVm().getAdress());
		adressDetails.setPostalCode(cvm.getAdressDetailsVm().getPostalCode());
		adressDetails.setCity(cvm.getAdressDetailsVm().getCity());
		adressDetails.setCountry(cvm.getAdressDetailsVm().getCountry());

		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setName(cvm.getPersonalDetailsVm().getName());
		personalDetails.setBirthday(cvm.getPersonalDetailsVm().getBirthday());
		personalDetails.setFirstname(cvm.getPersonalDetailsVm().getFirstname());
		personalDetails.setJobTitle(cvm.getPersonalDetailsVm().getJobTitle());
		personalDetails.setPhoneNumber(cvm.getPersonalDetailsVm().getPhoneNumber());
		personalDetails.setCreationDate(cvm.getPersonalDetailsVm().getCreationDate());
		personalDetails.setAdressDetails(adressDetails);

		Customer customer = new Customer();
		customer.setCompanyDetails(companyDetails);
		customer.setPersonalDetails(personalDetails);
		entityManager.persist(customer);

		System.out.println("Customer : " + cvm.toString() + " persisté");

		return customer.getId();

	}

	public void removeCustomer(Customer customer) {

		entityManager.remove(customer);
		System.out.println("Client supprimé --------------------");
	}

	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
	}

	public Customer findCustomerById(Long id) {

		return entityManager.find(Customer.class, id);

	}

	public List<Customer> findAllCustomer() {
		return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

}
