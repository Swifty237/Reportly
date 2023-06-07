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
		subscriptionDao.register(rsvm);
	}

	public Subscription findOneSubscription(long id) {
		return subscriptionDao.findById(id, Subscription.class);
	}

	public void updateSubscription(SubscriptionViewModel rsvm) {
		Subscription subscription = findOneSubscription(rsvm.getId());
		subscriptionDao.update(subscription);
	}

	public void deleteSubscription(long id) {
		Subscription subscription = findOneSubscription(id);
		subscriptionDao.remove(subscription);
	}

	public List<Subscription> findAllSubscriptions() {
		return subscriptionDao.findAll();
	}

}
