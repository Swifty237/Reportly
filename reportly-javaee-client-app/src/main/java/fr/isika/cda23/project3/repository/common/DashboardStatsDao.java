package fr.isika.cda23.project3.repository.common;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.activity.CraState;
import fr.isika.cda23.project3.presentation.viewModels.CraByStatusValuesViewModel;

@Stateless
public class DashboardStatsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@PostConstruct
	private void initData() {
		// TODO delete after stats tests !!!!!
		for(int i=1;i<20;i++) {
			Cra c = new Cra();
			c.setCreationDate(new Date());
			c.setState( Math.random() > 0.5 ? CraState.VALIDATED: CraState.DENIED );
			entityManager.persist(c);
		}
	}
	
	public CraByStatusValuesViewModel computeCraStatsByStatus() {
		CraByStatusValuesViewModel vm = new CraByStatusValuesViewModel();
		vm.setNbCrasInDeniedState( getNbCraOfStatus(CraState.DENIED) );
		vm.setNbCrasInValidatedState( getNbCraOfStatus(CraState.VALIDATED) );
		return vm; 
	}
	
	private Long getNbCraOfStatus(final CraState craState) {
		return (Long) this.entityManager
				.createQuery("SELECT count(cr) FROM Cra cr WHERE cr.state = :stateParam")
				.setParameter("stateParam", craState)
				.getSingleResult();
	}
}
