package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.annotation.ManagedBean;
import fr.isika.cda23.project3.business.RegisterPersonalDetailsService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterPersonalDetailsViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class RegisterPersonalDetailsBean {
	
	private RegisterPersonalDetailsService rpdService;
	
	private RegisterPersonalDetailsViewModel rpdvm = new RegisterPersonalDetailsViewModel();
	
	public void registerPersonalDetails() throws IOException{
		
		rpdService.registerPersonalDetails(rpdvm);
		rpdvm = new RegisterPersonalDetailsViewModel();
		
		NavigationUtils.redirectToUserList("");
		
	}

	public RegisterPersonalDetailsService getRpdService() {
		return rpdService;
	}

	public void setRpdService(RegisterPersonalDetailsService rpdService) {
		this.rpdService = rpdService;
	}

	public RegisterPersonalDetailsViewModel getRpdvm() {
		return rpdvm;
	}

	public void setRpdvm(RegisterPersonalDetailsViewModel rpdvm) {
		this.rpdvm = rpdvm;
	}
	
	

}
