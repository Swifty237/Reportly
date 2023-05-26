package fr.isika.cda.entities.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8983186402469938698L;

	/**
	 * 
	 */


	
	
	@Id
	@GeneratedValue
	private Long id ;
	
	@Enumerated
	private CraState State ; 
	
	
	@Temporal( TemporalType.TIMESTAMP)
	private Date CreationDate ; 
	
	@Temporal( TemporalType.TIMESTAMP)
	private Date ModificationDate ; 
	
	
	
	
	
	
	
}
