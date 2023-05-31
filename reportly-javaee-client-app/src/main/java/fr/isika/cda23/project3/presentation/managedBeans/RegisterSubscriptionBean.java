package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;

import javax.inject.Inject;

import fr.isika.cda.entities.esn.Subscription;
import fr.isika.cda23.project3.controllers.RegisterSubscriptionService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterSubsciptionViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

public class RegisterSubscriptionBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7612944265010053462L;
	
@Inject
	private RegisterSubscriptionService subscriptionService;
	private RegisterSubsciptionViewModel registerSubscriptionVm = new RegisterSubsciptionViewModel();
	private Subscription subscription;
	
	// enregistrer un abonnement
	
	public void register() throws IOException {
//		on vérifie si registerUserVm.getUserId()==0 si oui on crée un nouveau user, sinon on le modifie
		if (registerSubscriptionVm.get == 0) {

			subscriptionService.register(registerSubscriptionVm);
		} else {

			subscriptionService.modifyUser(registerSubscriptionVm);
		}

		NavigationUtils.redirectToUserList("listUser.xhtml");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
