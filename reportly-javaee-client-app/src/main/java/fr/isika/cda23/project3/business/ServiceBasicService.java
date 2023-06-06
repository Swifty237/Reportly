package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda23.project3.repository.esn.ServiceBasicDao;
import fr.isika.cda23.project3.repository.payment.BankCardDao;
import fr.isika.cda23.project3.repository.payment.PaypalDao;

@Stateless
public class ServiceBasicService {

	@Inject
	private ServiceBasicDao serviceBasicDao;

	public Long registerServiceBasic(ServiceBasic service) {
		return serviceBasicDao.registerSubscription(service);
	}

	public List<? extends ServiceBasic> getAllServices() {
		return serviceBasicDao.getAllServices();
	}

}
