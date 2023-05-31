package fr.isika.cda23.project3.repository.payment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.entities.esn.BankCard;
import fr.isika.cda23.project3.presentation.viewModels.AddBankCardViewModel;

@Stateless
public class BankCardDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long addBankCard(AddBankCardViewModel abvm) {
		
		BankCard bankcard = new BankCard();
		
		bankcard.setOwnerName(abvm.getOwnerName());
		bankcard.setBankCardNumber(abvm.getBankCardNumber());
		bankcard.setSecurityNumber(abvm.getSecurityNumber());
		bankcard.setDateExpiration(abvm.getDateExpiration());
		
		entityManager.persist(bankcard);
		
		System.out.println("Carte : " + abvm.toString() + " persistée");
		
		return bankcard.getId();
	}
	
	public void removeBankCard(BankCard bankcard) {
		entityManager.remove(bankcard);
		System.out.println("Carte bancaire supprimée ================================================");
	}
	
	public void updateBankCard(BankCard bankcard) {
		// A faire en fonction de la propriété (ou des propriétés) qu'on aura besoin de modifier
	}
	
	public BankCard findBankCardById(Long id) {
	    return entityManager.getReference(BankCard.class, id);
	}
}