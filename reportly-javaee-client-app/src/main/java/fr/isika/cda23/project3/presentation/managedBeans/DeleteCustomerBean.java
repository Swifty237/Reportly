package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.annotation.ManagedBean;

import fr.isika.cda23.project3.business.DeleteCustomerService;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class DeleteCustomerBean {
	
	
	private DeleteCustomerService rmCustomerService;
	
	
	
	public void deleteCustomer(Long id) throws IOException{
		rmCustomerService.deleteCustomer(id);
		NavigationUtils.redirectToUserList("showAllCustomer.Xhtml");
	}

}
