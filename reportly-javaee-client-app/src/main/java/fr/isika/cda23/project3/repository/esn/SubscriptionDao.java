package fr.isika.cda23.project3.repository.esn;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.presentation.viewModels.SubscriptionViewModel;

public class SubscriptionDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long register(SubscriptionViewModel rsvm) {
		
		Subscription subscription = new Subscription();
		
		subscription.setEndAt(rsvm.getEndAt());
		subscription.setStateOfSubscription(rsvm.getStateOfSubscription());
		subscription.setTypeOfPayment(rsvm.getTypeOfPayment());
		subscription.setAutomaticRenewal(rsvm.isAutomaticRenewal());
		subscription.setPayment(rsvm.getPayment());
		subscription.setServiceBasic(rsvm.getServiceBasic());
		subscription.setStartAt(rsvm.getStartAt());
		
		
		entityManager.persist(subscription);
		
		
		return subscription.getId();

	}
	
public void UpDate(Subscription subscription) {
		
		entityManager.merge(subscription);
		
	}
	
	
	public Subscription findOneSubscription(long id) {
		return entityManager.find(Subscription.class, id);
	
	}
	
	
	public List<Subscription> findAllSubscription(){
		return entityManager.createQuery("SELECT s FROM Subscription ", Subscription.class).getResultList();
	}

	public void deleteSubscription(Subscription subscription) {
		entityManager.remove(subscription);
		System.out.println("**************l'abonnement est supprimé************");
	}

	
	

}
