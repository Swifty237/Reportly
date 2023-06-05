package fr.isika.cda23.project3.presentation.managedBeans;



import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.RegisterCustomerService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterCustomerViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class RegisterCustomerBean implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2698259096055665222L;


	@Inject
	private RegisterCustomerService rcService;
	
	
	private RegisterCustomerViewModel rcvm = new RegisterCustomerViewModel();
	
	public void registerCustomer() throws IOException{
		
		rcService.registerCustomer(rcvm);
		rcvm = new RegisterCustomerViewModel();
		NavigationUtils.redirectToUserList("showAllCustomers.xhtml");
		
	}
	
	public RegisterCustomerViewModel getRcvm() {
		
		return rcvm;
	}
	
    public void setRcvm(RegisterCustomerViewModel rcvm) {
    	this.rcvm=rcvm;
    }
}
