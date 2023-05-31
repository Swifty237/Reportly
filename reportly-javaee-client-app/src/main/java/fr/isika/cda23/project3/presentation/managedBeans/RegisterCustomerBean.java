package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import fr.isika.cda23.project3.business.RegisterCustomerService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterCustomerViewModel;

public class RegisterCustomerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2119395159897123819L;
	
	
	private RegisterCustomerService rcService;
	
	
	private RegisterCustomerViewModel registerCustomerVm = new RegisterCustomerViewModel();
	
	
	

}
