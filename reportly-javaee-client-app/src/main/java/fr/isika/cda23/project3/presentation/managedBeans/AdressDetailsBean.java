package fr.isika.cda23.project3.presentation.managedBeans;

import javax.faces.bean.ManagedBean;

import fr.isika.cda23.project3.presentation.viewModels.AdressDetailsViewModel;

@ManagedBean
public class AdressDetailsBean {
	
	private AdressDetailsViewModel adressDetailsVm = new AdressDetailsViewModel();

	public AdressDetailsViewModel getAdressDetailsVm() {
		return adressDetailsVm;
	}

	public void setAdressDetailsVm(AdressDetailsViewModel adressDetailsVm) {
		this.adressDetailsVm = adressDetailsVm;
	}
	
}
