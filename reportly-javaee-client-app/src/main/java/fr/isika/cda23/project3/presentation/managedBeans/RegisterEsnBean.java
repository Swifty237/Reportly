package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

//import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;

@ManagedBean
@SessionScoped
public class RegisterEsnBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5469910363275392680L;

//	@Inject
//	private RegisterEsnService reService;

	private RegisterEsnViewModel registerEsnVm = new RegisterEsnViewModel();

	public String register() {
//		reService.register(registerEsnVm);
		
		registerEsnVm = new RegisterEsnViewModel();
		
		return "index.xhtml";
		
	}

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}

	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}
//	@Inject
//	private RegisterEsnService reService;
//
//	private RegisterEsnViewModel registerEsnVm = new RegisterEsnViewModel();
//
//	public String register() {
//		reService.register(registerEsnVm);
//		
//		registerEsnVm = new RegisterEsnViewModel();
//		
//		return "index.xhtml";
//		
//	}
//
//	public RegisterEsnViewModel getRegisterEsnVm() {
//		return registerEsnVm;
//	}
//
//	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
//		this.registerEsnVm = registerEsnVm;
//	}
}
