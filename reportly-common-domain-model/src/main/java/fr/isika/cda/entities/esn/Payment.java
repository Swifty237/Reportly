package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)   
public abstract class Payment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8429719138674322450L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
}
