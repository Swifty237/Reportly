package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fr.isika.cda.entities.activity.Cra;
import fr.isika.cda.entities.contract.ContractDetails;
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
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;
	
	private Date expenseDate;
	
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	private String reason;
	private double amount;
	private ErState PaidState;
}
