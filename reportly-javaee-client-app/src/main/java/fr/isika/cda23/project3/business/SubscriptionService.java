package fr.isika.cda23.project3.business;

import java.util.List;
import javax.inject.Inject;
import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.presentation.viewModels.SubscriptionViewModel;
import fr.isika.cda23.project3.repository.esn.SubscriptionDao;

public class SubscriptionService {

	
	@Inject
	private SubscriptionDao subscriptionDao;
	
	public void registerSubscription(SubscriptionViewModel rsvm) {
		Long id = subscriptionDao.register(rsvm);
		
	}
	
	public Subscription findOneSubscription(long id) {
		return subscriptionDao.findOneSubscription(id);
	}
	
	
	public void updateSubscription(SubscriptionViewModel rsvm) {
		Subscription subscription = subscriptionDao.findOneSubscription(rsvm.getId());
		subscriptionDao.UpDate(subscription);
		}
	
	
	public void deleteSubscription(long id) {
		Subscription subscription = subscriptionDao.findOneSubscription(id);
		subscriptionDao.deleteSubscription(subscription);

	}
	
	
	public List<Subscription> showAllSubscriptions(){
		return subscriptionDao.findAllSubscription();
	}
	
	
	
	
}
