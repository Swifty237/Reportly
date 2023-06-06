package fr.isika.cda23.project3.presentation.managedBeans;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda23.project3.business.TeamService;
import fr.isika.cda23.project3.repository.user.UserDao;
import fr.isika.cda23.project3.utils.NavigationUtils;
import fr.isika.cda23.project3.utils.SessionUtils;

@ManagedBean
@SessionScoped
public class TeamBean implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -5643132843249336582L;
	@Inject
	private UserDao userDao;
	@Inject
	private TeamService tService;
	private Employee employee;
	private String teamName;
	private List<Employee> userAccounts;
	private List<Object[]> teamMembers;
	private List<ProjectTeam> listProjectTeams;
	@PostConstruct
	public void init() {
		userAccounts = userDao.getManagerNotBusy(SessionUtils.getEsnIdFromSession());
		teamMembers = tService.getProjectTeamsWithManagerByEsnId(SessionUtils.getEsnIdFromSession());
		listProjectTeams = tService.getProjectTeamByEsnId(SessionUtils.getEsnIdFromSession());
	}
	public void addToTeam() throws IOException {
		employee.setBusy(true);
		ProjectTeam pTeam = new ProjectTeam();
		pTeam.setProjectName(teamName);
		pTeam.addManager(employee);
		tService.modifyEmployee(employee);
		tService.addToTeam(pTeam);
		resetFieldsAndReloadData();
		NavigationUtils.redirectToUserList("team.xhtml");
	}
	private void resetFieldsAndReloadData() {
		this.employee = null;
		this.teamName = null;
		userAccounts = userDao.getManagerNotBusy(SessionUtils.getEsnIdFromSession());
		teamMembers = tService.getProjectTeamsWithManagerByEsnId(SessionUtils.getEsnIdFromSession());
		listProjectTeams = tService.getProjectTeamByEsnId(SessionUtils.getEsnIdFromSession());
	}
	public List<Employee> getUserAccounts() {
		return userAccounts;
	}
	public void setUserAccounts(List<Employee> userAccounts) {
		this.userAccounts = userAccounts;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Object[]> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<Object[]> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public List<ProjectTeam> getListProjectTeams() {
		return listProjectTeams;
	}
	public void setListProjectTeams(List<ProjectTeam> listProjectTeams) {
		this.listProjectTeams = listProjectTeams;
	}
}