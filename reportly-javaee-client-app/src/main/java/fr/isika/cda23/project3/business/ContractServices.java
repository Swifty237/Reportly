package fr.isika.cda23.project3.business;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda.entities.contract.ContractType;
import fr.isika.cda23.project3.repository.Contract.ContractDao;

@Stateless
public class ContractServices {

	@Inject
	private ContractDao contractDao;
	
	public List<Contract> getAllContracts() {
		return contractDao.findAllContracts();
	}
	
	public long countAllContracts() {
		return contractDao.countContracts();
	}
	
	public Date getCreationDate(Long id) {
		return contractDao.findContractById(id).getContractDetails().getCreationDate();
	}
	
	public Date getStartDate(Long id) {
		return contractDao.findContractById(id).getContractDetails().getStartAt();
	}
	
	public Date getEndDate(Long id) {
		return contractDao.findContractById(id).getContractDetails().getEndAt();
	}
	
	public String getCustomerBrand(Long id) {
		return contractDao.findContractById(id).getCustomer().getCompanyDetails().getBrand();
	}
	
	public String getCustomerReferentName(Long id) {
		return contractDao.findContractById(id).getCustomer().getPersonalDetails().getName();
	}
	
	public ContractType getTypeOfContract(Long id) {
		return contractDao.findContractById(id).getContractDetails().getTypeOfContract();
	}
}
