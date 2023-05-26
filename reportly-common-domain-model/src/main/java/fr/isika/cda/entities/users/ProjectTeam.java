package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	private Long userId;
	
	private String projectName;
	
	
	
}
