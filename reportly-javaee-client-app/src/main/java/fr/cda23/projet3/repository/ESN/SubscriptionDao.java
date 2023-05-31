package fr.cda23.projet3.repository.ESN;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Subscription;
@Stateless
public class SubscriptionDao implements SubscriptionIDao  {

	@PersistenceContext
	private EntityManager entityManager;
	
	public SubscriptionDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Long persister() {
		Subscription subscription = new Subscription();
		
		subscription.getState();
		subscription.getEndAt();
		subscription.getStartAt();
		subscription.getTypeOfPayment();
		
		entityManager.persist(subscription);
		System.out.println(" Abonnement : " +subscription.toString() + "persisté");
		
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
