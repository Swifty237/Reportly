package fr.isika.cda23.project3.business;

import javax.inject.Inject;

import fr.isika.cda.entities.esn.BankCard;
import fr.isika.cda.entities.esn.Paypal;
import fr.isika.cda23.project3.presentation.viewModels.ServiceBasicViewModel;
import fr.isika.cda23.project3.repository.esn.ServiceBasicDao;
import fr.isika.cda23.project3.repository.payment.BankCardDao;
import fr.isika.cda23.project3.repository.payment.PaypalDao;

public class ServiceBasicService {

	@Inject
	private ServiceBasicDao serviceBasicDao;
	@Inject
	private PaypalDao paypalDao;
	@Inject
	private BankCardDao bankCardDao;
	
	
	public void registerServiceBasic(ServiceBasicViewModel rsvm) {
		Paypal paypal = new Paypal();
		BankCard bankcard = new BankCard();
	// à decomposer	
		if ((paypal.getId()!= null && rsvm.getPrice()== 11) || (bankcard.getId()!= null && rsvm.getPrice()== 11) ) {
			Long id = serviceBasicDao.register(rsvm);		
		}
		
	}
	
	
	
	
	
}
