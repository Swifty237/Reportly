package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team_manager")
public class TeamManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8716418227477090060L;

	@Id
	@GeneratedValue
	private Long userId;
}
