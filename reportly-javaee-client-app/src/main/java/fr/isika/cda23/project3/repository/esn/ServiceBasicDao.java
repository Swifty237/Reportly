package fr.isika.cda23.project3.repository.esn;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.BankCard;
import fr.isika.cda.entities.esn.PaymentChoice;
import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda.entities.esn.ServicePremium;
import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda.entities.esn.SubscriptionState;
import fr.isika.cda23.project3.presentation.viewModels.ServiceBasicViewModel;

@Stateless
public class ServiceBasicDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public Long register(ServiceBasicViewModel sbvm) {
		ServicePremium premium = sbvm.getPremium();
		entityManager.persist(premium);
		sbvm.setPremium(premium);
		return sbvm.getPremium().getId();

	}

	@SuppressWarnings("unchecked")
	public List<? extends ServiceBasic> getAllServices() {
		return entityManager.createQuery("SELECT s FROM ServiceBasic s").getResultList();
	}

	public Long registerSubscription(ServiceBasic service) {
		LocalDate now = LocalDate.now();
		LocalDate end = now.plus(24, ChronoUnit.MONTHS);

		Subscription s = new Subscription();
		s.setServiceBasic(service);
		s.setStateOfSubscription(SubscriptionState.BASIC);
		s.setStartAt(
				Date.from(now.plus(24, ChronoUnit.MONTHS).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
		s.setEndAt(Date.from(end.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
		s.setAutomaticRenewal(false);
		
		BankCard payment = new BankCard();
		payment.setBankCardNumber(111);
		
		s.setPayment(payment);
		s.setTypeOfPayment(PaymentChoice.BANK_CARD);
		
		entityManager.persist(s);
		return s.getId();
	}
}