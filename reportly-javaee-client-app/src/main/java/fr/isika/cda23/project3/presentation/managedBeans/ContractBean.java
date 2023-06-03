package fr.isika.cda23.project3.presentation.managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda23.project3.business.ContractServices;

@ManagedBean
public class ContractBean {

	@Inject
	private ContractServices contractServices;
	
	private List<Contract> listContracts;
	private int countContracts;
	
	@PostConstruct
	public void init() {
		listContracts = contractServices.getAllContracts();
		countContracts = contractServices.countAllContracts();
	}

	public List<Contract> getListContracts() {
		return listContracts;
	}

	public void setListContracts(List<Contract> listContracts) {
		this.listContracts = listContracts;
	}

	public int getCountContracts() {
		return countContracts;
	}

	public void setCountContracts(int countContracts) {
		this.countContracts = countContracts;
	}
}
