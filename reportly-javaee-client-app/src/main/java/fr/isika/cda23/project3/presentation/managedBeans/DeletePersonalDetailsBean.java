package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.DeletePersonalDetailsService;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class DeletePersonalDetailsBean {

	@Inject
	private DeletePersonalDetailsService rmPersonalDetailsService;
	
	public void deletePersonalDetails(Long id) throws IOException {
		rmPersonalDetailsService.deletePersonalDetails(id);
		NavigationUtils.redirectToUserList("");
	}
}
