package fr.isika.cda23.project3.repository.company;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.ProjectTeam;
import fr.isika.cda.entities.users.UserRole;

@Stateless
public class TeamDao {
	@PersistenceContext
	private EntityManager entityManager;

	public Long addToTeam(ProjectTeam team) {
		entityManager.persist(team);
		return team.getId();
	}

	public void removeProjectTeam(Long projectId) {
		String query = "SELECT p FROM ProjectTeam p WHERE p.id = :projectId";
		ProjectTeam project = entityManager.createQuery(query, ProjectTeam.class).setParameter("projectId", projectId)
				.getSingleResult();
		entityManager.remove(project);
	}

	public List<Object[]> getProjectTeamsWithManagerByEsnId(Long esnId) {
		String query = "SELECT pt.id, pt.projectName, e.pers.firstname, e.pers.name, e.userRole FROM ProjectTeam pt JOIN pt.employeeList e JOIN e.esn es WHERE es.id = :esnId AND e.userRole = :userRole";
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(query, Object[].class);
		typedQuery.setParameter("esnId", esnId);
		typedQuery.setParameter("userRole", UserRole.TEAM_MANAGER);
		return typedQuery.getResultList();
	}

	public ProjectTeam getProjectTeamById(Long id) {
		try {
			return entityManager
					.createQuery("SELECT proTeam FROM ProjectTeam proTeam WHERE proTeam.id = :id", ProjectTeam.class)
					.setParameter("id", id).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<Employee> getEmployeesByProjectTeamId(Long projectId) {
		String query = "SELECT p FROM ProjectTeam p LEFT JOIN FETCH p.employeeList WHERE p.id = :projectId";
		ProjectTeam project = entityManager.createQuery(query, ProjectTeam.class).setParameter("projectId", projectId)
				.getSingleResult();
		return project != null ? project.getEmployeeList() : Collections.emptyList();
	}

	public List<Employee> getAvailableEmployees() {
		String query = "SELECT e FROM Employee e WHERE e.busy = false";
		return entityManager.createQuery(query, Employee.class).getResultList();
	}

	public void addEmployeeToTeam(final Long id, final Employee employee) {
		// Fetch le projet avec les employés pour évoiter le lazy load
		String query = "SELECT p FROM ProjectTeam p LEFT JOIN FETCH p.employeeList WHERE p.id = :projectId";
		ProjectTeam project = entityManager.createQuery(query, ProjectTeam.class).setParameter("projectId", id)
				.getSingleResult();
		project.addEmployee(employee);
		entityManager.merge(employee);
		entityManager.merge(project);
	}

	public void deleteEmployeeFromTeam(Employee employee, final Long id) {
		String query = "SELECT p FROM ProjectTeam p LEFT JOIN FETCH p.employeeList WHERE p.id = :projectId";
		ProjectTeam project = entityManager.createQuery(query, ProjectTeam.class).setParameter("projectId", id)
				.getSingleResult();
		project.deleteEmployeeFromTeam(employee);
		entityManager.merge(employee);
		entityManager.merge(project);
	}

	public List<ProjectTeam> getProjectTeamByEsnId(Long id) {
		String query = "SELECT p FROM ProjectTeam p WHERE p.esn.id= :esnId";
		return entityManager.createQuery(query, ProjectTeam.class).setParameter("esnId", id).getResultList();
	}
}
