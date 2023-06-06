package fr.isika.cda23.project3.repository.common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.common.CompanyDetails;
import fr.isika.cda23.project3.presentation.viewModels.CompanyDetailsViewModel;
import fr.isika.cda23.projet3.repository.GenericDao;

@Stateless
public class CompanyDetailsDao extends GenericDao<CompanyDetails, Long> {

	@PersistenceContext
	private EntityManager entityManager;

	public CompanyDetails registerCompanyDetails(CompanyDetailsViewModel cdvm) {

		CompanyDetails companyDetails = new CompanyDetails();

		companyDetails.setBrand(cdvm.getBrand());
		companyDetails.setCreationDate(cdvm.getCreationDate());
		companyDetails.setEmail(cdvm.getEmail());

		entityManager.persist(companyDetails);
		return companyDetails;

	}

}
