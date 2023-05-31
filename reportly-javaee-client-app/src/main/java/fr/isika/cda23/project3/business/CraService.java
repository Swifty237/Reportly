package fr.isika.cda23.project3.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda23.projet3.repository.Activity.CraDao;

@Stateless
public class CraService {

	@Inject
	private CraDao craDao;

}

	


