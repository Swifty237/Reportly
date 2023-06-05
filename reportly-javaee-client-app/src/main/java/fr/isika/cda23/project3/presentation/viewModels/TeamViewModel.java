package fr.isika.cda23.project3.presentation.viewModels;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;

public class TeamViewModel {
	private Long id;
	private Double tjm;
	private ProjectTeam projectTeam;
	private Employee employee;

	public Double getTjm() {
		return tjm;
	}

	public void setTjm(Double tjm) {
		this.tjm = tjm;
	}

	public ProjectTeam getProjectTeam() {
		return projectTeam;
	}

	public void setProjectTeam(ProjectTeam projectTeam) {
		this.projectTeam = projectTeam;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamViewModel [tjm=");
		builder.append(tjm);
		builder.append(", projectTeam=");
		builder.append(projectTeam);
		builder.append("]");
		return builder.toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
