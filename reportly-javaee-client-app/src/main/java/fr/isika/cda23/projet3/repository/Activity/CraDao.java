package fr.isika.cda23.projet3.repository.Activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda23.project3.presentation.viewModels.RegisterCraViewModel;
import fr.isika.cda23.project3.presentation.viewModels.RegisterUserViewModel;


@Stateless
public class CraDao {

	
	@PersistenceContext
	private static EntityManager entityManager ;
	
	
	public CraDao(EntityManager entityManager ) {
		this.entityManager =entityManager;
	}

		public Long persist (Cra cra ) {
			
	    entityManager.persist(cra);
		return cra.getId();
		
		}
		
		
		public void update (Cra cra) {
			entityManager.merge(cra);
			
		}
		
		public void remove (Cra cra ) {
			
			entityManager.remove(cra);
		}
	
		public Cra  findById (Long id ) {
			
			return entityManager.find( Cra.class ,id );
					
		}

		public static List<Cra> findAllCra() {
			return entityManager.createQuery("Votre Liste", Cra.class).getResultList() ;
		}
}
