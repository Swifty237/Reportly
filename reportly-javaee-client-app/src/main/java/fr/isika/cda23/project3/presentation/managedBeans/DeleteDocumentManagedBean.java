package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda23.project3.business.DeleteDocumentService;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
public class DeleteDocumentManagedBean {

	@Inject
	private DeleteDocumentService rmDocService;
		
	public void deleteDoc(Long id) throws IOException {
		rmDocService.deleteDoc(id);
		NavigationUtils.redirectToUserList("showAllDocuments.xhtml");
	}
}
