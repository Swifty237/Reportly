package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Employee extends UserAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6240533294536565573L;

	private double tjm;
	private boolean busy;
	private String skills;
	
	@ManyToOne @JoinColumn(name="projectTeam_id")
	public ProjectTeam projectTeam;

	public Employee(String email, String password, int tjm, String skills) {
		this.password = password;
		this.email = email;
		this.tjm = tjm;
		this.skills = skills;

	}

}
