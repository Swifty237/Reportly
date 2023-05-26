package fr.isika.cda.entities.service;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.users.Employee;

@Entity
public class ExpenseReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9039326845895212101L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	public Employee employee;
	
	private Date expenseDate;
	private Date creationDate;
	private String reason;
	private double amount;
	private ErState PaidState;
}
