package fr.isika.cda23.project3.utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

	
public final class SessionUtils {	
	public static String getUserEmailFromSession() {
		HttpSession session = getSession();
		// Lire une propriété depuis la session
		return (String) session.getAttribute("email");
	}

	public static void setUserEmailIntoSession(final String email) {
		HttpSession session = getSession();
		// Ajoute une entrée (clé, valeur) dans la map de la session
		session.setAttribute("email", email);
	}
	public static String getEsnNameFromSession() {
		HttpSession session = getSession();
		// Lire une propriété depuis la session 
		return (String) session.getAttribute("nameEsn");
	}
	
	public static void setEsnNameIntoSession(final String nameEsn) {
		HttpSession session = getSession();
		// Ajoute une entrée (clé, valeur) dans la map de la session
		session.setAttribute("nameEsn", nameEsn);
	}
	public static Long getEsnIdFromSession() {
		HttpSession session = getSession();
		// Lire une propriété depuis la session 
		return (Long) session.getAttribute("esnId");
	}
	
	public static void seEsnIdIntoSession(final Long esnId) {
		HttpSession session = getSession();
		// Ajoute une entrée (clé, valeur) dans la map de la session
		session.setAttribute("esnId", esnId);
	}
	
//	public static List<Role> getUserRolesFromSession() {
//		HttpSession session = getSession();
//		// Lire une propriété depuis la session 
//		return (List<Role>) session.getAttribute("roles");
//	}
//
//	public static void setUserRolesIntoSession(final List<Role> roles) {
//		HttpSession session = getSession();
//		// Ajoute une entrée (clé, valeur) dans la map de la session
//		session.setAttribute("roles", roles);
//	}

	public static boolean isUserLoggedIn() {
		// Si pas de lgoin mémorisé en session -> personne n'est connecté !!
		return getUserEmailFromSession() != null && !getUserEmailFromSession().isBlank();
	}

	public static void resetSession() {
		HttpSession session = getSession();
		session.invalidate();
	}

	private static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}

	private SessionUtils() {
		// Pour interdire d'instancier cette classe
	}

}
