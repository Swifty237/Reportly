package fr.isika.cda23.projet3.repository.Activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Cra;

@Stateless
public class TrainingDao {

	@PersistenceContext
	private EntityManager entityManager ;
	
	
	public TrainingDao(EntityManager entityManager ) {
		this.entityManager =entityManager;
	}

		public Long persist (TrainingDao trainingDao ) {
			
	    entityManager.persist(trainingDao  );
		return trainingDao .getId();
		
		}
		
		
		public void update (TrainingDao trainingDao) {
			entityManager.merge(trainingDao);
			
		}
		
		public void remove (TrainingDao trainingDao ) {
			
			entityManager.remove(trainingDao);
		}
	
		public TrainingDao findById (Long id ) {
			
			return entityManager.find( TrainingDao.class ,id );
					
		}

}


