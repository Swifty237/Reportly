package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.business.SubscriptionService;
import fr.isika.cda23.project3.presentation.viewModels.SubscriptionViewModel;

@javax.faces.bean.ManagedBean
public class SubscriptionManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4423980414704486126L;
	
	@Inject
	private SubscriptionService subscriptionService;

	private SubscriptionViewModel rsvm = new SubscriptionViewModel();
	private List<Subscription> listSubscriptions;
	
	@PostConstruct
	private void init() {
		listSubscriptions = subscriptionService.showAllSubscriptions();
	}

	/**
	 * enregistrer un abonnement
	 */
	public String registerSubscription() throws IOException {
	/**
	 * on vérifie si le ID de SubscriptionViewModel égal à 0, si oui on crée un nouveau abonnement
     */

		if (rsvm.getId() == 0) {

			subscriptionService.registerSubscription(rsvm);
		}

	return	"subscription.xhtml";

	}

	/**
	 * supprimer un abonnement
	 */
	public String deleteSubscription(long id) throws IOException {
		subscriptionService.deleteSubscription(id);
		return	"subscription.xhtml";
	}

	public List<Subscription> getListSubscriptions() {
		return listSubscriptions;
	}

	public void setListSubscriptions(List<Subscription> listSubscriptions) {
		this.listSubscriptions = listSubscriptions;
	}

	public SubscriptionViewModel getRsvm() {
		return rsvm;
	}

	public void setRsvm(SubscriptionViewModel rsvm) {
		this.rsvm = rsvm;
	}

}
