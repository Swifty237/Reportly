package fr.isika.cda23.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4977514293438720436L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String TextColor;
	private String BackgroundColor;
	private String Logo;
	private String TextDescription;
}
