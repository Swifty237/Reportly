package fr.isika.cda23.project3.repository.payment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.Paypal;
import fr.isika.cda23.project3.presentation.viewModels.AddPaypalViewModel;

	@Stateless
	public class PaypalDao {
		
		@PersistenceContext
		private EntityManager entityManager;
		
		public Long Paypal(AddPaypalViewModel appvm) {
			
			Paypal paypal = new Paypal();
			
			paypal.setEmailPaypal(appvm.getEmailPaypal());
			paypal.setPasswordPaypal(appvm.getPasswordPaypal());
			
			entityManager.persist(paypal);
			
			System.out.println("Paypal : " + appvm.toString() + " persistée");
			
			return paypal.getId();
		}
		
		public void removeBankCard(Paypal paypal) {
			entityManager.remove(paypal);
			System.out.println("Carte bancaire supprimée ================================================");
		}
		
		public void updateBankCard(Paypal paypal) {
			// A faire en fonction de la propriété (ou des propriétés) qu'on aura besoin de modifier
		}
		
		public Paypal findBankCardById(Long id) {
		    return entityManager.getReference(Paypal.class, id);
		}
	}
