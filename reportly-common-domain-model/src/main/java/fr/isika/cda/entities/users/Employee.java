package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6240533294536565573L;
	
	@Id
	@GeneratedValue
	private Long id;
	private int tjm;
	private boolean busy;
	private String skills;

}
