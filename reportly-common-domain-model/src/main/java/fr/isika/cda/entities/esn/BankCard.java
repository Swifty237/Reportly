package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class BankCard extends Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7870002736397125650L;
	
	private String ownerName;
	private String bankCardNumber;
	private int securityNumber;
	private Date dateExpiration;
	
}
