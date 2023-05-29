package fr.isika.cda23.project3.repository.Contract;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda23.project3.presentation.viewModels.AddContractViewModel;

@Stateless
public class ContractDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Long addContract(AddContractViewModel acvm) {
		
		Contract contract = new Contract();
		
		contract.setContractDetails(acvm.getContractDetails());
		contract.setCustomer(acvm.getCustomer());
		contract.setStateOfContract(acvm.getStateOfContract());
		contract.setProjectTeam(acvm.getProjectTeam());
		
		entityManager.persist(contract);
		
		return contract.getId();
		
	}
	
	public void removeContract(Contract contract) {
		entityManager.remove(contract);
		System.out.println("Contrat supprimé ================================================");
	}
	
	public void updateContract() {
		// A faire en fonction de la propriété (ou des propriétés) qu'on aura besoin de modifier
	}
	
	public Contract findContractById(Long id) {
		return entityManager.find(Contract.class, id);
	}
	
	public List<Contract> findAllContracts(){
		return entityManager.createQuery("SELECT c FROM Contract c", Contract.class).getResultList();
	}
}
