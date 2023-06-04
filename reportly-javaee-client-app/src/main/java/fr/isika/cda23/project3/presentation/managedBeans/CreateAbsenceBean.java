package fr.isika.cda23.project3.presentation.managedBeans;

import javax.faces.bean.ManagedBean;

import fr.isika.cda23.project3.presentation.viewModels.CreateAbsenceViewModel;

@ManagedBean
public class CreateAbsenceBean {

	// Déclarer le view model ensuite l'instancier car on va l'utiliser dés le
	// chargement de la page

	private CreateAbsenceViewModel createAbsenceVm = new CreateAbsenceViewModel();

	// première méthode à appeler depuis la vue
	public void confirm() {

		System.out.println(createAbsenceVm);
	}

	//Méthode  Annuler les champs du view model (du formulaire) 
	public void clear() {

		createAbsenceVm = new CreateAbsenceViewModel();
	
	}

	//methode selectionner un type d'absence 
	
	public void selectAbsence () {
		
		System.out.println(createAbsenceVm.getTypeAbsence());
	}
	
	
	
	
	
	
	
	
	//Methode téléchagrer justificatif 
	
	public void download() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getters et setters du vieww model
	public CreateAbsenceViewModel getCreateAbsenceVm() {
		return createAbsenceVm;
	}

	public void setCreateAbsenceVm(CreateAbsenceViewModel createAbsenceVm) {
		this.createAbsenceVm = createAbsenceVm;
	}

}
