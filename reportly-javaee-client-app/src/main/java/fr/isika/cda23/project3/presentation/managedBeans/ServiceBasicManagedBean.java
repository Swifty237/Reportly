package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda.entities.esn.ServiceBasic;
import fr.isika.cda23.project3.business.ServiceBasicService;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class ServiceBasicManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8412197492459204921L;
	
	@Inject
	private ServiceBasicService serviceBasicService;
	
	private List<? extends ServiceBasic> services;
	
	@PostConstruct
	private void init() {
		services = serviceBasicService.getAllServices();
	}
	
	/**
	 * enregistrer un abonnement Basic
	 */
	public void registerServiceBasic(ServiceBasic service) throws IOException {
		Long idSub = serviceBasicService.registerServiceBasic(service);
		System.out.println("Created subscription with id : " + idSub);
		
		NavigationUtils.redirectToUserList("index.xhtml");
	}

	public List<? extends ServiceBasic> getServices() {
		return services;
	}
}
