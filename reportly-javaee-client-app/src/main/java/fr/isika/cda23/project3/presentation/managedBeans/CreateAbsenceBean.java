package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.activity.AbsenceType;
import fr.isika.cda.entities.users.UserAccount;
import fr.isika.cda23.project3.presentation.viewModels.CreateAbsenceViewModel;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.SessionUtils;
import fr.isika.cda23.projet3.repository.Activity.CreateAbsenceRepositoryDao;

@ManagedBean
public class CreateAbsenceBean implements Serializable {
	
	
	@Inject
	private CreateAbsenceRepositoryDao createAbsenceRepositoryDao ;
	
	@Inject
	private UserDao userDao;

	private UserAccount account;

	/**
	 * 
	 */
	private static final long serialVersionUID = -5381564762412759410L;

	// Déclarer le view model ensuite l'instancier car on va l'utiliser dés le
	// chargement de la page

	private CreateAbsenceViewModel createAbsenceVm = new CreateAbsenceViewModel();

	@PostConstruct
	public void init() {
		String connectedUserEmail = SessionUtils.getUserEmailFromSession();
		account = userDao.findByEmail(connectedUserEmail);
	}

	// première méthode à appeler depuis la vue
	public void save() {
		System.out.println(createAbsenceVm);
	}

	// Méthode Annuler les champs du view model (du formulaire)
	public void clear() {
		createAbsenceVm = new CreateAbsenceViewModel();
	}

	// Methode téléchagrer justificatif

	public void download() {

	}
	
	public AbsenceType[] typesAbsences() {
		return AbsenceType.values();
	}
	
	// getters et setters du vieww model
	public CreateAbsenceViewModel getCreateAbsenceVm() {
		return createAbsenceVm;
	}

	public void setCreateAbsenceVm(CreateAbsenceViewModel createAbsenceVm) {
		this.createAbsenceVm = createAbsenceVm;
	}

	public UserAccount getAccount() {
		return account;
	}

}
