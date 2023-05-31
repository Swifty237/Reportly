package fr.isika.cda23.project3.utils;

import java.io.IOException;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

//Permet de faire un RedirectTo
public class NavigationUtils {
	public static void redirectToUserList(String url) throws IOException {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		ExternalContext externalContext = facesContext.getExternalContext();
		
		externalContext.redirect("/reportly-javaee-client-app/" + url);
	}
}
