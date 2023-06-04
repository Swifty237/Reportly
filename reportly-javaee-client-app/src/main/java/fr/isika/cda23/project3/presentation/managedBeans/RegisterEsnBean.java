package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.RegisterEsnService;
import fr.isika.cda23.project3.presentation.viewModels.RegisterEsnViewModel;

@ManagedBean
@SessionScoped
public class RegisterEsnBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5469910363275392680L;

<<<<<<< HEAD
	@Inject
	private RegisterEsnService reService;

	private RegisterEsnViewModel registerEsnVm = new RegisterEsnViewModel();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public String register() {
		reService.register(registerEsnVm);
		
		registerEsnVm = new RegisterEsnViewModel();
		
		return "index.xhtml";
		
	}

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}

	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}
=======
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
>>>>>>> 15eb741 (Suppression not use files)

=======
	public void register() {
=======
	public String register() {
>>>>>>> 84f94f9 (register esn ok)
		reService.register(registerEsnVm);
		
		registerEsnVm = new RegisterEsnViewModel();
		
		return "index.xhtml";
		
	}
<<<<<<< HEAD
>>>>>>> 54dbdcd (user)
=======

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}

	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}

>>>>>>> 84f94f9 (register esn ok)
=======
	public void register() {
=======
	public String register() {
>>>>>>> ab3abe1 (register esn ok)
		reService.register(registerEsnVm);
		
		registerEsnVm = new RegisterEsnViewModel();
		
		return "index.xhtml";
		
	}
<<<<<<< HEAD
>>>>>>> 3d333c7 (user)
=======

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}

	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}

>>>>>>> ab3abe1 (register esn ok)
=======
	public void register() {
=======
	public String register() {
>>>>>>> a6ba52f (register esn ok)
		reService.register(registerEsnVm);
		
		registerEsnVm = new RegisterEsnViewModel();
		
		return "index.xhtml";
		
	}
<<<<<<< HEAD
>>>>>>> b7c6b2a (user)
=======

	public RegisterEsnViewModel getRegisterEsnVm() {
		return registerEsnVm;
	}

	public void setRegisterEsnVm(RegisterEsnViewModel registerEsnVm) {
		this.registerEsnVm = registerEsnVm;
	}

>>>>>>> a6ba52f (register esn ok)
}
