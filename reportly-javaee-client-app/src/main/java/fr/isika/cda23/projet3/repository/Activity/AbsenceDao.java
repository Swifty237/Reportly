package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.activity.Absence;
import fr.isika.cda23.project3.presentation.viewModels.CreateAbsenceViewModel;



@Stateless
public class AbsenceDao  {
	
	
	
	@PersistenceContext
	private EntityManager entityManager ;
	
	
	public Long Create(CreateAbsenceViewModel viewModel) {
		
		//1- creer mon entité 
		
		Absence absence = new Absence ();
		
		
		
		//2- mapper le contenu du vm dans l'entité creee
		
		
		
		
		
		
		//3- persister l'entité 
		
		
		//4- renvoyer son Id (gnéré auto )
		
		
		
		
		
		
		return null ;
		
	}
	
	
	
	
}
