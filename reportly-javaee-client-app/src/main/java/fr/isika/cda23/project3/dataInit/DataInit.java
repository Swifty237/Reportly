package fr.isika.cda23.project3.dataInit;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.ExpenseReportState;
import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.contract.Contract;
import fr.isika.cda.entities.contract.ContractDetails;
import fr.isika.cda.entities.contract.ContractState;
import fr.isika.cda.entities.contract.ContractType;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda.entities.common.AdressDetails;
import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.common.DocumentType;
import fr.isika.cda.entities.common.ExpenseReport;

@Singleton
@Startup
public class DataInit {
	
	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
		
//        ContractDetails contractDetails1 = new ContractDetails();
//        contractDetails1.setCreationDate(new Date());
//        contractDetails1.setStartAt(new Date());
//        contractDetails1.setEndAt(new Date());
//        contractDetails1.setTypeOfContract(ContractType.MANAGEMENT);
//
//        ContractDetails contractDetails2 = new ContractDetails();
//        contractDetails2.setCreationDate(new Date());
//        contractDetails2.setStartAt(new Date());
//        contractDetails2.setEndAt(new Date());
//        contractDetails2.setTypeOfContract(ContractType.FIXED_PRICE);
//
//        ContractDetails contractDetails3 = new ContractDetails();
//        contractDetails3.setCreationDate(new Date());
//        contractDetails3.setStartAt(new Date());
//        contractDetails3.setEndAt(new Date());
//        contractDetails3.setTypeOfContract(ContractType.MANAGEMENT);
//
//        ContractDetails contractDetails4 = new ContractDetails();
//        contractDetails4.setCreationDate(new Date());
//        contractDetails4.setStartAt(new Date());
//        contractDetails4.setEndAt(new Date());
//        contractDetails4.setTypeOfContract(ContractType.FIXED_PRICE);
//        
//        // -------------------------------------------------------------------------------------------
//        
//        Document document1 = new Document();
//        document1.setName("Document 5");
//        document1.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
//        document1.setDocCreation(new Date());
//
//        Document document2 = new Document();
//        document2.setName("Document 6");
//        document2.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
//        document2.setDocCreation(new Date());
//
//        Document document3 = new Document();
//        document3.setName("Document 3");
//        document3.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
//        document3.setDocCreation(new Date());
//
//        Document document4 = new Document();
//        document4.setName("Document 4");
//        document4.setTypeOfDoc(DocumentType.ESN_CERTIFICATION);
//        document4.setDocCreation(new Date());
//        
//        // ----------------------------------------------------------------------------------------------
//        
//        CompanyDetails companyDetails1 = new CompanyDetails();
//        companyDetails1.setCreationDate(new Date());
//        companyDetails1.setBrand("Company 1");
//        companyDetails1.setEmail("company1@example.com");
//        companyDetails1.setDocument(document1);
//
//        CompanyDetails companyDetails2 = new CompanyDetails();
//        companyDetails2.setCreationDate(new Date());
//        companyDetails2.setBrand("Company 2");
//        companyDetails2.setEmail("company2@example.com");
//        companyDetails2.setDocument(document2);
//
//        CompanyDetails companyDetails3 = new CompanyDetails();
//        companyDetails3.setCreationDate(new Date());
//        companyDetails3.setBrand("Company 3");
//        companyDetails3.setEmail("company3@example.com");
//        companyDetails3.setDocument(document3);
//
//        CompanyDetails companyDetails4 = new CompanyDetails();
//        companyDetails4.setCreationDate(new Date());
//        companyDetails4.setBrand("Company 4");
//        companyDetails4.setEmail("company4@example.com");
//        companyDetails4.setDocument(document4);
//        
//        // -----------------------------------------------------------------------------------
//        
//        PersonalDetails personalDetails1 = new PersonalDetails("Doe", "John", new Date(), 123456789, "Manager");
//        personalDetails1.setCreationDate(new Date());
//        personalDetails1.setAdressDetails(new AdressDetails());
//
//        PersonalDetails personalDetails2 = new PersonalDetails("Smith", "Jane", new Date(), 987654321, "Engineer");
//        personalDetails2.setCreationDate(new Date());
//        personalDetails2.setAdressDetails(new AdressDetails());
//
//        PersonalDetails personalDetails3 = new PersonalDetails("Johnson", "Michael", new Date(), 654321987, "Analyst");
//        personalDetails3.setCreationDate(new Date());
//        personalDetails3.setAdressDetails(new AdressDetails());
//
//        PersonalDetails personalDetails4 = new PersonalDetails("Williams", "Emily", new Date(), 456789123, "Designer");
//        personalDetails4.setCreationDate(new Date());
//        personalDetails4.setAdressDetails(new AdressDetails());
//        
//        // ---------------------------------------------------------------------------------------------------------
//
//        Customer customer1 = new Customer();
//        customer1.setCompanyDetails(companyDetails1);
//        customer1.setPersonalDetails(personalDetails1);
//
//        Customer customer2 = new Customer();
//        customer2.setCompanyDetails(companyDetails2);
//        customer2.setPersonalDetails(personalDetails2);
//
//        Customer customer3 = new Customer();
//        customer3.setCompanyDetails(companyDetails3);
//        customer3.setPersonalDetails(personalDetails3);
//
//        Customer customer4 = new Customer();
//        customer4.setCompanyDetails(companyDetails4);
//        customer4.setPersonalDetails(personalDetails4);
//
//        ProjectTeam projectTeam1 = new ProjectTeam();
//        ProjectTeam projectTeam2 = new ProjectTeam();
//        ProjectTeam projectTeam3 = new ProjectTeam();
//        ProjectTeam projectTeam4 = new ProjectTeam();
//
//        // ----------------------------------------------------------------------------------------------
//        
//        Contract contrat1 = new Contract();
//        contrat1.setContractDetails(contractDetails1);
//        contrat1.setCustomer(customer1);
//        contrat1.setStateOfContract(ContractState.CREATION);
//        contrat1.setProjectTeam(projectTeam1);
//
//        Contract contrat2 = new Contract();
//        contrat2.setContractDetails(contractDetails2);
//        contrat2.setCustomer(customer2);
//        contrat2.setStateOfContract(ContractState.IN_PROGRESS);
//        contrat2.setProjectTeam(projectTeam2);
//
//        Contract contrat3 = new Contract();
//        contrat3.setContractDetails(contractDetails3);
//        contrat3.setCustomer(customer3);
//        contrat3.setStateOfContract(ContractState.END);
//        contrat3.setProjectTeam(projectTeam3);
//
//        Contract contrat4 = new Contract();
//        contrat4.setContractDetails(contractDetails4);
//        contrat4.setCustomer(customer4);
//        contrat4.setStateOfContract(ContractState.CANCELED);
//        contrat4.setProjectTeam(projectTeam4);
//        
//        em.persist(customer1);
//        em.persist(customer2);
//        em.persist(customer3);
//        em.persist(customer4);
//
//        em.persist(contrat1);
//        em.persist(contrat2);
//        em.persist(contrat3);
//        em.persist(contrat4);
//		
//        // ------------------------------------------------------------------------------------------
//		
//        Document document5 = new Document();
//        document5.setName("Document 5");
//        document5.setTypeOfDoc(DocumentType.EXPENSE_REPORT_INVOICE);
//        document5.setDocCreation(new Date());
//
//        Document document6 = new Document();
//        document6.setName("Document 6");
//        document6.setTypeOfDoc(DocumentType.EXPENSE_REPORT_INVOICE);
//        document6.setDocCreation(new Date());
//
//        Document document7 = new Document();
//        document7.setName("Document 3");
//        document7.setTypeOfDoc(DocumentType.EXPENSE_REPORT_INVOICE);
//        document7.setDocCreation(new Date());
//
//        Document document8 = new Document();
//        document8.setName("Document 4");
//        document8.setTypeOfDoc(DocumentType.EXPENSE_REPORT_INVOICE);
//        document8.setDocCreation(new Date());
//
//        // -------------------------------------------------------------------------------------------
//		
//		 	ExpenseReport expenseReport1 = new ExpenseReport();
//	        expenseReport1.setDocument(document5);
//	        expenseReport1.setExpenseDate(new Date());
//	        expenseReport1.setCreationDate(new Date());
//	        expenseReport1.setReason("Raison 1");
//	        expenseReport1.setAmount(100.0);
//	        expenseReport1.setExpenseReportState(ExpenseReportState.PAID);
//
//	        ExpenseReport expenseReport2 = new ExpenseReport();
//	        expenseReport2.setDocument(document6);
//	        expenseReport2.setExpenseDate(new Date());
//	        expenseReport2.setCreationDate(new Date());
//	        expenseReport2.setReason("Raison 2");
//	        expenseReport2.setAmount(200.0);
//	        expenseReport2.setExpenseReportState(ExpenseReportState.VALIDATED);
//		
//	        ExpenseReport expenseReport3 = new ExpenseReport();
//	        expenseReport3.setDocument(document7);
//	        expenseReport3.setExpenseDate(new Date());
//	        expenseReport3.setCreationDate(new Date());
//	        expenseReport3.setReason("Raison 3");
//	        expenseReport3.setAmount(300.0);
//	        expenseReport3.setExpenseReportState(ExpenseReportState.PENDING);
//
//	        ExpenseReport expenseReport4 = new ExpenseReport();
//	        expenseReport4.setDocument(document8);
//	        expenseReport4.setExpenseDate(new Date());
//	        expenseReport4.setCreationDate(new Date());
//	        expenseReport4.setReason("Raison 4");
//	        expenseReport4.setAmount(400.0);
//	        expenseReport4.setExpenseReportState(ExpenseReportState.REJECTED);
//	        
//	        em.persist(expenseReport1);
//	        em.persist(expenseReport2);
//	        em.persist(expenseReport3);
//	        em.persist(expenseReport4);
    }		
}
	
