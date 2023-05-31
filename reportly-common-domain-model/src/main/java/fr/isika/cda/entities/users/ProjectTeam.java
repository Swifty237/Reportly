package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProjectTeam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7890800222969685493L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String projecName;

	public ProjectTeam() {
		super();
		
	}
	
	
	
}
