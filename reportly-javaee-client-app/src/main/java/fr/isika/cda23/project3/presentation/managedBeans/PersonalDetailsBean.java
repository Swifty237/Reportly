package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.PersonalDetailsServices;
import fr.isika.cda23.project3.presentation.viewModels.PersonalDetailsViewModel;

@ManagedBean
public class PersonalDetailsBean {
	
	@Inject
	private PersonalDetailsServices personalDetailsServices;
	
	private PersonalDetailsViewModel personalDetailsVm = new PersonalDetailsViewModel();
	
	public void registerPersonalDetails() throws IOException{
		
//		personalDetailsServices.registerPersonalDetails(personalDetailsVm);
//		personalDetailsVm = new PersonalDetailsViewModel();		
	}

	public PersonalDetailsViewModel getPersonalDetailsVm() {
		return personalDetailsVm;
	}

	public void setPersonalDetailsVm(PersonalDetailsViewModel personalDetailsVm) {
		this.personalDetailsVm = personalDetailsVm;
	}
}
