package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomDesignDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4977514293438720436L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String textColor;
	private String backgroundColor;
	private String logo;
	private String textDescription;

}
