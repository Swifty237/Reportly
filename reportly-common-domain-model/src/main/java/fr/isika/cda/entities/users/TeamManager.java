package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
	
	@OneToOne @JoinColumn(name="projectTeam_id")
	private ProjectTeam projectTeam;

}
