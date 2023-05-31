package fr.isika.cda23.projet3.repository.Activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Activity;
import fr.isika.cda.entities.activity.Cra;

@Stateless
public class ActivityDao {

	@PersistenceContext
	private EntityManager entityManager ;
	
	
	public ActivityDao(EntityManager entityManager ) {
		this.entityManager =entityManager;
	}

		public void persist (ActivityDao activityDao ) {
			
	    entityManager.persist(activityDao);
		
		
		}
		
		
		public void update (ActivityDao activityDao) {
			entityManager.merge(activityDao);
			
		}
		
		public void remove (ActivityDao activityDao ) {
			
			entityManager.remove(activityDao);
		}
	
		public Activity  findById (Long id ) {
			
			return entityManager.find( Activity.class ,id );
					
		}

		
}


