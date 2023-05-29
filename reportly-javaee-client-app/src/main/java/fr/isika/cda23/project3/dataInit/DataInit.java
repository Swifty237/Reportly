package fr.isika.cda23.project3.dataInit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda.entities.contract.ContractDetails;
import fr.isika.cda.entities.contract.ContractState;
import fr.isika.cda.entities.contract.ContractType;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda23.project3.presentation.viewModels.AddContractDetailsViewModel;
import fr.isika.cda23.project3.presentation.viewModels.AddContractViewModel;
import fr.isika.cda23.project3.repository.Contract.ContractDao;
import fr.isika.cda23.project3.repository.Contract.ContractDetailsDao;

@Singleton
@Startup
public class DataInit {
		
	@Inject
	private ContractDetailsDao contractDetailsDao;
	
	@Inject
	private ContractDao contractDao;
	
	AddContractDetailsViewModel acdvm = new AddContractDetailsViewModel();
	AddContractViewModel acvm = new AddContractViewModel();

	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
		
		
		// Test AddContractDetails
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		
		acdvm.setCreationDate(new Date());
		
		try {
			acdvm.setStartAt(dateFormat.parse("10-12-2022"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		acdvm.setTypeOfContract(ContractType.FIXED_PRICE);
		
		Long id = contractDetailsDao.addContractDetails(acdvm);
		ContractDetails contractDetails = contractDetailsDao.findContractDetailsById(id);
		
		Customer customer = new Customer();
		em.persist(customer);
		ProjectTeam projectTeam = new ProjectTeam();
		em.persist(projectTeam);
		
		acvm.setCustomer(customer);
		acvm.setContractDetails(contractDetails);		
		acvm.setProjectTeam(projectTeam );
		acvm.setStateOfContract(ContractState.CREATION);
		
		contractDao.addContract(acvm);
		
		
		//	Test findAllContracts
		for (Contract contract : contractDao.findAllContracts()) {
			System.out.println(contract);
		}
		
		// Test findContractById
		System.out.println(contractDao.findContractById(1L));
		
		// Test removeDocument
//		documentDao.removeDocument(documentDao.findDocumentById(2L));
		
//		for (Document document : documentDao.findAllDocuments()) {
//			System.out.println(document);
//		}
//		
		
	}
}
