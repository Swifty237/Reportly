package fr.isika.cda23.projet3.repository.Activity;

import javax.ejb.Stateless;

import fr.isika.cda.entities.activity.Absence;
import fr.isika.cda23.projet3.repository.GenericDao;

@Stateless
public class AbsenceRepositoryDao extends GenericDao<Absence, Long> {
}
