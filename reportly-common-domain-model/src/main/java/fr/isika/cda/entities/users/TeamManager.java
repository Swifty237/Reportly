package fr.isika.cda.entities.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "team_manager")
@PrimaryKeyJoinColumn(name = "userId")
public class TeamManager extends UserAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8716418227477090060L;
	
	@OneToMany
	private List<ProjectTeam> projectTeamList=new ArrayList<>();

}
