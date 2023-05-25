package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class BankCard extends Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7870002736397125650L;
	
	private String OwnerName;
	private String BankCardNumber;
	private int SecurityNumber;
	private Date DateExpiration;
	
}
