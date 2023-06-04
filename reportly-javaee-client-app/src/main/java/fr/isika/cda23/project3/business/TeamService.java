package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda23.project3.repository.company.TeamDao;
import fr.isika.cda23.project3.repository.user.UserDao;

@Stateless
public class TeamService {

	@Inject
	TeamDao teamDao;

	@Inject
	UserDao userDao;

	public void addToTeam(ProjectTeam team) {
		Long id = teamDao.addToTeam(team);
		System.out.println("projectTeam ajouté avec id: " + id);
	}

	@Transactional
	public void modifyEmployee(Employee emp) {
		Long id = userDao.modifyEmployee(emp);
		System.out.println("emp modifié avec id: " + id);
	}

	public List<Object[]> getProjectTeamsWithMembersByEsnId(Long esnId) {
		return teamDao.getProjectTeamsWithMembersByEsnId(esnId);
	}

}
