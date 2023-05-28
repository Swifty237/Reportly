package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "service_details")
public class ServiceDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8720882788928725662L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "users_limitation")
	private int usersLimitation;

	@Column(name = "contracts_limitation")
	private int contractsLimitation;

	@Column(name = "active_expense_report")
	private boolean activeExpenseReport;

	@Column(name = "active_statistic_report")
	private boolean activeStatisticReport;

	@Column(name = "active_custom_design")
	private boolean activeCustomDesign;
	
	

	@OneToOne(cascade = CascadeType.ALL ) 
	public ServiceBasic serviceBasic;
	
	
}
