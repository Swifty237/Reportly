package fr.isika.cda23.project3.repository.esn;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.presentation.viewModels.SubscriptionViewModel;
import fr.isika.cda23.projet3.repository.GenericDao;

@Stateless
public class SubscriptionDao extends GenericDao<Subscription, Long> {
	
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

	public List<Subscription> findAll() {
		return entityManager.createQuery("SELECT s FROM Subscription s", Subscription.class).getResultList();
	}

}
