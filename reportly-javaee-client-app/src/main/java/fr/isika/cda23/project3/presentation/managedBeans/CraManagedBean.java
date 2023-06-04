package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.Serializable;

import javax.inject.Inject;

import fr.isika.cda23.project3.business.CraServices;

public class CraManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1763744904674552554L;

	@Inject
	private CraServices craService ; 
	
}