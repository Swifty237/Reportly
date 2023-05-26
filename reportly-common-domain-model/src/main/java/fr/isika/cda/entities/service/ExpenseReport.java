package fr.isika.cda.entities.service;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
=======
import javax.persistence.ManyToOne;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.users.Employee;
>>>>>>> relation_user

@Entity
public class ExpenseReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9039326845895212101L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
<<<<<<< HEAD
	@Temporal(TemporalType.DATE)
=======

	@ManyToOne
	public Employee employee;
	
>>>>>>> relation_user
	private Date expenseDate;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	private String reason;
	private double amount;
	private ErState PaidState;
}
