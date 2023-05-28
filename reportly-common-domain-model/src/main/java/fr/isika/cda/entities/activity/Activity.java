package fr.isika.cda.entities.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fr.isika.cda.entities.common.Document;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.users.Employee;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Activity implements Serializable {
	
	@ManyToOne
	public Cra cra ; 

	private static final long serialVersionUID = -8098047044102899069L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Temporal(TemporalType.DATE)
	protected Date startAt;

	@Temporal(TemporalType.DATE)
	protected Date endAt;

	protected int overtime;

	protected String description;

	protected Date createDate;

	protected Boolean onCall;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Customer customer;

}
