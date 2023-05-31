package fr.isika.cda.entities.contract;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import fr.isika.cda.entities.users.ProjectTeam;

@Entity
public class Contract implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4201743641123277277L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Enumerated(EnumType.STRING)
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private ContractDetails contractDetails;
	
	@ManyToOne
	public Customer customer;
	private ContractState stateOfContract;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private ProjectTeam projectTeam;
	
	public Contract() {
		super();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContractDetails getContractDetails() {
		return contractDetails;
	}

	public void setContractDetails(ContractDetails contractDetails) {
		this.contractDetails = contractDetails;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ContractState getStateOfContract() {
		return stateOfContract;
	}

	public void setStateOfContract(ContractState stateOfContract) {
		this.stateOfContract = stateOfContract;
	}

	public ProjectTeam getProjectTeam() {
		return projectTeam;
	}

	public void setProjectTeam(ProjectTeam projectTeam) {
		this.projectTeam = projectTeam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [id=");
		builder.append(id);
		builder.append(", contractDetails=");
		builder.append(contractDetails);
		builder.append(", customer=");
		builder.append(customer);
		builder.append(", stateOfContract=");
		builder.append(stateOfContract);
		builder.append(", projectTeam=");
		builder.append(projectTeam);
		builder.append("]");
		return builder.toString();
	}	
	
	
}