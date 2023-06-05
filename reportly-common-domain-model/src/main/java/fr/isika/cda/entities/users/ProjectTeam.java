package fr.isika.cda.entities.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_team")
public class ProjectTeam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7890800222969685493L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String projectName;
	
	@OneToMany
	@JoinColumn(name = "fk_project_team_id")
	private List<Employee> employeeList = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectTeam [id=");
		builder.append(id);
		builder.append(", projectName=");
		builder.append(projectName);
		builder.append("]");
		return builder.toString();
	}

	public boolean addManager(Employee employee) {
		return this.employeeList.add(employee);
	}

	public void addEmployee(Employee employee) {
		this.employeeList.add(employee);
	}
}
