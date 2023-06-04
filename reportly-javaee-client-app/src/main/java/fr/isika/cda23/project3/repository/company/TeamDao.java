package fr.isika.cda23.project3.repository.company;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.isika.cda.entities.users.ProjectTeam;

public class TeamDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addToTeam(ProjectTeam team) {
		entityManager.persist(team);
		return team.getId();
	}

	public List<Object[]> getProjectTeamsWithMembersByEsnId(Long esnId) {
		String query = "SELECT pt.projectName, e.pers.firstname, e.pers.name, e.userRole FROM ProjectTeam pt JOIN pt.employeeList e JOIN e.esn es WHERE es.id = :esnId";
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(query, Object[].class);
		typedQuery.setParameter("esnId", esnId);
		return typedQuery.getResultList();
	}
}