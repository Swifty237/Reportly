package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda23.project3.business.ServiceBasicService;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
public class ServiceBasicManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8412197492459204921L;

	@Inject
	private ServiceBasicService serviceBasicService;

	private List<? extends ServiceBasic> services;
	
	private String abonnement;

	@PostConstruct
	private void init() {
		services = serviceBasicService.getAllServices();
	}

	/**
	 * enregistrer un abonnement Basic
	 * @throws IOException 
	 */
	public void addBasic() throws IOException {
		abonnement="basic";
		NavigationUtils.redirectToUserList("ecranEsn.xhtml");
	}
	
	public void addPremium() throws IOException {
		abonnement="premium";
		NavigationUtils.redirectToUserList("ecranEsn.xhtml");
	}

	public void registerServiceBasic(ServiceBasic service) throws IOException {
		serviceBasicService.registerServiceBasic(service);
		NavigationUtils.redirectToUserList("subscription.xhtml");
	}

	public List<? extends ServiceBasic> getServices() {
		return services;
	}

	public String getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(String abonnement) {
		this.abonnement = abonnement;
	}
}