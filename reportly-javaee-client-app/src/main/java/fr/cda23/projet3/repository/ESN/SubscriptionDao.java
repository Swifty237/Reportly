package fr.cda23.projet3.repository.ESN;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.presentation.viewModels.RegisterSubsciptionViewModel;
@Stateless
public class SubscriptionDao {

	@PersistenceContext
	private EntityManager entityManager;
	
//	public SubscriptionDao(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}
	
	public Long register(RegisterSubsciptionViewModel viewModelSubscription) {
		Subscription subscription = new Subscription();
		subscription.setEndAt(viewModelSubscription.getEndAt());
		subscription.setStateOfSubscription(viewModelSubscription.getStateOfSubscription());
		subscription.setTypeOfPayment(viewModelSubscription.getTypeOfPayment());
		subscription.setAutomaticRenewal(viewModelSubscription.isAutomaticRenewal());
		
		entityManager.persist(subscription);
		
		
		return subscription.getId();

	}
	
	public void UpDate(Subscription subscription) {
		
		entityManager.merge(subscription);
		
	}
	
	public void Delete(Subscription subscription) {
		entityManager.remove(subscription);
		System.out.println("**************l'abonnement est supprimé************");
		
	}
	
	public Subscription findById(long id) {
		return entityManager.find(Subscription.class, id);
	
	}
	
	public List<Subscription> findAllSubscription(){
		return entityManager.createQuery(" *********Votre liste******** ",Subscription.class).getResultList();
	}
	
}
