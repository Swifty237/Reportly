package fr.isika.cda.entities.common;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdressDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6200773657260155980L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String adress;
	private String postalCode;
	private String city;
	private String country;
}
