package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUsersLimitation() {
		return usersLimitation;
	}

	public void setUsersLimitation(int usersLimitation) {
		this.usersLimitation = usersLimitation;
	}

	public int getContractsLimitation() {
		return contractsLimitation;
	}

	public void setContractsLimitation(int contractsLimitation) {
		this.contractsLimitation = contractsLimitation;
	}

	public boolean isActiveExpenseReport() {
		return activeExpenseReport;
	}

	public void setActiveExpenseReport(boolean activeExpenseReport) {
		this.activeExpenseReport = activeExpenseReport;
	}

	public boolean isActiveStatisticReport() {
		return activeStatisticReport;
	}

	public void setActiveStatisticReport(boolean activeStatisticReport) {
		this.activeStatisticReport = activeStatisticReport;
	}

	public boolean isActiveCustomDesign() {
		return activeCustomDesign;
	}

	public void setActiveCustomDesign(boolean activeCustomDesign) {
		this.activeCustomDesign = activeCustomDesign;
	}
	
	
	

}
