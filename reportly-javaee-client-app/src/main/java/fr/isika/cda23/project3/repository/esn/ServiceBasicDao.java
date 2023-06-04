package fr.isika.cda23.project3.repository.esn;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda23.project3.presentation.viewModels.ServiceBasicViewModel;

public class ServiceBasicDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long register(ServiceBasicViewModel sbvm) {
		
		ServiceBasic serviceBasic = new ServiceBasic();
		
		serviceBasic.setCreationDate(sbvm.getCreationDate());
		serviceBasic.setEnabled(sbvm.isEnabled());
		serviceBasic.setPrice(sbvm.getPrice());
		serviceBasic.setServiceDetails(sbvm.getServiceDetails());
		
		entityManager.persist(serviceBasic);
		
		return serviceBasic.getId();

	}
}
