package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.users.UserAccount;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda.entities.users.UserAccount;

@Entity
public class PersonalDetails implements Serializable {
//	L'interface "Serializable" est utilisée pour indiquer
//	que les objets de cette classe peuvent convertis en une représentation pouvant être stockée ou transférée

//	déclaration d'un identifiant unique pour cette version spécifique de la classe lors de la sérialisation.

	/**
	 * 
	 */
	private static final long serialVersionUID = 1058842310211418354L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String name;
	
	private String firstname;

	@Temporal(TemporalType.DATE)
	private Date birdhday;

	@Column(name = "phone_number")
	private int phoneNumber;

	@Column(name = "job_title")
	private String jobTitle;

	@Temporal(TemporalType.DATE)
	@Column(name = "creation_date")
	private Date creationDate;



	public PersonalDetails() {
		super();
		
	}
	
	

	@OneToOne(cascade = CascadeType.ALL)
	public AdressDetails adressDetails;

	
}
