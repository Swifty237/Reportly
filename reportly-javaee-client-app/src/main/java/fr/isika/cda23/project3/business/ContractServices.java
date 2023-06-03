package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda23.project3.repository.Contract.ContractDao;

@Stateless
public class ContractServices {

	@Inject
	private ContractDao contractDao;
	
	public List<Contract> getAllContracts() {
		return contractDao.findAllContracts();
	}
	
	public int countAllContracts() {
		return getAllContracts().size();
	}
}
