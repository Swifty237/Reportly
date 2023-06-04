package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda23.project3.presentation.viewModels.RegisterCompanyDetailsViewModel;

@Stateless 
public class CompanyDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long registerCompanyDetails(RegisterCompanyDetailsViewModel rcdvm) {
		
		CompanyDetails companyDetails = new CompanyDetails();
		
		companyDetails.setBrand(rcdvm.getBrand());
		companyDetails.setCreationDate(rcdvm.getCreationDate());
		companyDetails.setEmail(rcdvm.getEmail());
		
		entityManager.persist(companyDetails);
		
		System.out.println("CompanyDetails :" +rcdvm.toString()+"persisté");
		
		return companyDetails.getId();
		
	}
	
	public void removeCompanyDetails (CompanyDetails companyDetails) {
		entityManager.remove(companyDetails);
	    System.out.println("le détail de l'entreprise est supprimé ===================");	
	}
	
	public void updateCompanyDetails (CompanyDetails companyDetails) {
		entityManager.merge(companyDetails);
	}
	
	public CompanyDetails findCompanyDetailsById(Long id) {
		return entityManager.find(CompanyDetails.class, id);
	}

}
