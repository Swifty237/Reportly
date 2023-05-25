package fr.isika.cda23.entities.users;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ProjectTeam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7890800222969685493L;


	@Id
	@GeneratedValue
	private Long userId;
	
	private String projecName;
	
}
