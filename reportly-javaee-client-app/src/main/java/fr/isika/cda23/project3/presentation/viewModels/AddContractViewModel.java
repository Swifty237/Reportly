package fr.isika.cda23.project3.presentation.viewModels;

import fr.isika.cda.entities.contract.ContractDetails;
import fr.isika.cda.entities.contract.ContractState;
import fr.isika.cda.entities.contract.Customer;
import fr.isika.cda.entities.users.ProjectTeam;

public class AddContractViewModel {

	private ContractDetails contractDetails;
	private Customer customer;
	private ContractState stateOfContract;
	private ProjectTeam projectTeam;
	
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
		builder.append("AddContractViewModel [contractDetails=");
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
