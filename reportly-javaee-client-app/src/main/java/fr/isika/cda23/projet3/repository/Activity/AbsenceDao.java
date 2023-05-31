package fr.isika.cda23.projet3.repository.Activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Absence;

@Stateless
public class AbsenceDao {


	@PersistenceContext
	private EntityManager entityManager ;
	
	
	public AbsenceDao(EntityManager entityManager ) {
		this.entityManager =entityManager;
	}

		public Long persist (Absence absence  ) {
			
	    entityManager.persist(absence);
		return absence.getId();
		
		}
		
		
		public void update (Absence absence ) {
			entityManager.merge(absence);
			
		}
		
		public void remove (Absence absence  ) {
			
			entityManager.remove(absence);
		}
	
		public Absence  findById (Long id ) {
			
			return entityManager.find(Absence .class ,id );
					
		}

		public List<Absence> findAllAbsence() {
			return entityManager.createQuery("Votre Liste", Absence.class).getResultList() ;
		}
}


