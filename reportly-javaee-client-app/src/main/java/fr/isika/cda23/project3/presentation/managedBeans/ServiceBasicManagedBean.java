package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;

import javax.inject.Inject;

import fr.isika.cda23.project3.business.ServiceBasicService;
import fr.isika.cda23.project3.presentation.viewModels.ServiceBasicViewModel;
public class ServiceBasicManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8412197492459204921L;
	
	
	@Inject
	private ServiceBasicService serviceBasicService;
	
	private ServiceBasicViewModel srvm = new ServiceBasicViewModel();
	

	/**
	 * enregistrer un abonnement Basic
	 */
	public String registerServiceBasic() throws IOException {
	/**
	 * on vérifie si le ID de SubscriptionViewModel égal à 0, si oui on crée un nouveau abonnement
     */

		if (srvm.getId() == 0) {

			serviceBasicService.registerServiceBasic(srvm);
		}

	return	"subscription.xhtml";

	}
}
