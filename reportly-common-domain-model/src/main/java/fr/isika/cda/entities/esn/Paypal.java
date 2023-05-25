package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Paypal extends Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5073928922012336232L;
	
	private String EmailPaypal;
	private String PasswordPaypal;
}
