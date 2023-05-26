package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

}
