package fr.isika.cda23.project3.presentation.viewModels;

import fr.isika.cda.entities.users.Employee;

public class TeamViewModel {

	private String projectTeam;
	private Employee employee;
	private Double tjm;
	
	public String getProjectTeam() {
		return projectTeam;
	}
	public void setProjectTeam(String projectTeam) {
		this.projectTeam = projectTeam;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Double getTjm() {
		return tjm;
	}
	public void setTjm(Double tjm) {
		this.tjm = tjm;
	}
	
	

}
