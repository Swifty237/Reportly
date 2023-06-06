package fr.isika.cda23.project3.presentation.managedBeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda23.project3.business.TeamService;
import fr.isika.cda23.project3.presentation.viewModels.TeamViewModel;
import fr.isika.cda23.project3.utils.NavigationUtils;

@ManagedBean
@SessionScoped
public class TeamEmployeeBean implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3356176022141043836L;
	@Inject
	private TeamService tService;
	private TeamViewModel tvm = new TeamViewModel();
	private List<Employee> employeesOfSelectedProjectTeam;
	private List<Employee> availableEmployees;

	public void init() throws IOException {
		availableEmployees = tService.getAvailableEmployees();
		// Récupérer le f:param transmis depuis le bouton de la vue team.xhtml
		Map<String, String> map = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String teamIdParamValue = map.get("teamId");
		if (teamIdParamValue != null) {
			Long teamId = Long.parseLong(teamIdParamValue);
			tvm.setId(teamId);
			tvm.setProjectTeam(tService.getProjectTeamById(teamId));
			employeesOfSelectedProjectTeam = tService.getEmployeesByProjectTeamId(teamId);
		}
		NavigationUtils.redirectToUserList("teamEmployee.xhtml");
	}

	public void addToTeam() throws IOException {
		tvm.getEmployee().setTjm(tvm.getTjm());
		tService.addEmployeeToTeam(tvm.getId(), tvm.getEmployee());
		reloadViewModel();
		reloadEmployeesAndAvailableUsers();
		NavigationUtils.redirectToUserList("teamEmployee.xhtml");
	}

	public void deleteEmployeeFromTeam(Employee employee) throws IOException {
		employee.setBusy(false);
		tService.deleteEmployeeFromTeam(employee, tvm.getId());
		reloadViewModel();
		reloadEmployeesAndAvailableUsers();
		if (employeesOfSelectedProjectTeam.size() == 0) {
			tService.deleteProjectTeam(tvm.getId());
			NavigationUtils.redirectToUserList("team.xhtml");
		} else {

			NavigationUtils.redirectToUserList("teamEmployee.xhtml");
		}
	}

	private void reloadEmployeesAndAvailableUsers() throws IOException {
		availableEmployees = tService.getAvailableEmployees();
		employeesOfSelectedProjectTeam = tService.getEmployeesByProjectTeamId(tvm.getId());
	}

	private void reloadViewModel() {
		ProjectTeam projectTeamById = tService.getProjectTeamById(tvm.getId());
		tvm.setProjectTeam(projectTeamById);
		tvm.setId(projectTeamById.getId());
		tvm.setTjm(Double.valueOf(0));
	}

	public TeamViewModel getTvm() {
		return tvm;
	}

	public void setTvm(TeamViewModel tvm) {
		this.tvm = tvm;
	}

	public List<Employee> getAvailableEmployees() {
		return availableEmployees;
	}

	public void setAvailableEmployees(List<Employee> availableEmployees) {
		this.availableEmployees = availableEmployees;
	}

	public List<Employee> getEmployeesOfSelectedProjectTeam() {
		return employeesOfSelectedProjectTeam;
	}

	public void setEmployeesOfSelectedProjectTeam(List<Employee> employeesOfSelectedProjectTeam) {
		this.employeesOfSelectedProjectTeam = employeesOfSelectedProjectTeam;
	}
}