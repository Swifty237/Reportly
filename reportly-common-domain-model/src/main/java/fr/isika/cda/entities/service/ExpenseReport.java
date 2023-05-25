package fr.isika.cda.entities.service;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExpenseReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9039326845895212101L;

	@Id
	@GeneratedValue
	private Long id;

	private Date expenseDate;
	private Date creationDate;
	private String reason;
	private double amount;
	private ErState PaidState;
}
