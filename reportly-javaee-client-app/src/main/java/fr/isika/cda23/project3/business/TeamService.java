package fr.isika.cda23.project3.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import fr.isika.cda.entities.esn.Esn;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda23.project3.repository.company.EsnDao;
import fr.isika.cda23.project3.repository.company.TeamDao;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.SessionUtils;

@Stateless
public class TeamService {
	@Inject
	private EsnDao esnDao;

	@Inject
	private TeamDao teamDao;

	@Inject
	private UserDao userDao;

	public void addToTeam(ProjectTeam team) {
		Esn esn = esnDao.getEsnById(SessionUtils.getEsnIdFromSession());
		if (esn != null) {
			team.setEsn(esn);
			Long id = teamDao.addToTeam(team);
			System.out.println("projectTeam ajouté avec id: " + id);
		} else {
			System.out.println("ajouter team failed");
		}
	}

	@Transactional
	public void modifyEmployee(Employee emp) {
		Long id = userDao.modifyEmployee(emp);
		System.out.println("emp modifié avec id: " + id);
	}

	public List<Object[]> getProjectTeamsWithManagerByEsnId(Long esnId) {
		return teamDao.getProjectTeamsWithManagerByEsnId(esnId);
	}

	public List<Employee> getEmployeesByProjectTeamId(Long projectId) {
		return teamDao.getEmployeesByProjectTeamId(projectId);
	}

	public void addEmployeeToTeam(final Long id, Employee employee) {
		employee.setBusy(true);
		teamDao.addEmployeeToTeam(id, employee);
	}

	public List<Employee> getAvailableEmployees() {
		return teamDao.getAvailableEmployees();
	}

	public ProjectTeam getProjectTeamById(Long teamId) {
		return teamDao.getProjectTeamById(teamId);
	}

	public void deleteEmployeeFromTeam(Employee employee, final Long id) {
		teamDao.deleteEmployeeFromTeam(employee, id);
	}

	public List<ProjectTeam> getProjectTeamByEsnId(Long id) {
		return teamDao.getProjectTeamByEsnId(id);
	}

	public void deleteProjectTeam(Long id) {
		teamDao.removeProjectTeam(id);

	}
}