package fr.isika.cda23.project3.presentation.managedBeans;


import javax.faces.bean.ManagedBean;

import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;

@ManagedBean
public class PersonalDetailsBean {
		
	private PersonalDetailsViewModel personalDetailsVm = new PersonalDetailsViewModel();
	
	public PersonalDetailsViewModel getPersonalDetailsVm() {
		return personalDetailsVm;
	}

	public void setPersonalDetailsVm(PersonalDetailsViewModel personalDetailsVm) {
		this.personalDetailsVm = personalDetailsVm;
	}
}
