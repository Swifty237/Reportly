package fr.isika.cda.entities.activity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Absence implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7508142804908681675L;


	@Id
	@GeneratedValue
	
	private Long Id ;
	
	
	@Enumerated(EnumType.STRING)
	private AbsenceType TypeOfAbsence ; 
	 
}
