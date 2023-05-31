package fr.isika.cda23.project3.repository.Contract;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.contract.ContractDetails;
import fr.isika.cda23.project3.presentation.viewModels.AddContractDetailsViewModel;

@Stateless
public class ContractDetailsDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addContractDetails(AddContractDetailsViewModel acdvm) {

		ContractDetails contractDetails = new ContractDetails();

		contractDetails.setCreationDate(acdvm.getCreationDate());
		contractDetails.setStartAt(acdvm.getStartAt());
		contractDetails.setEndAt(acdvm.getEndAt());
		contractDetails.setTypeOfContract(acdvm.getTypeOfContract());

		entityManager.persist(contractDetails);

		return contractDetails.getId();
	}

	public void removeContractDetails(ContractDetails contractDetails) {
		entityManager.remove(contractDetails);
		System.out.println("Détails du contrat supprimé ================================================");
	}

	public void updateContractDetails() {
		// A faire en fonction de la propriété (ou des propriétés) qu'on aura besoin de
		// modifier
	}

	public ContractDetails findContractDetailsById(Long id) {
		return entityManager.find(ContractDetails.class, id);
	}

	public List<ContractDetails> findAllContractDetails() {
		return entityManager.createQuery("SELECT cd FROM ContractDetails cd", ContractDetails.class).getResultList();
	}
}
