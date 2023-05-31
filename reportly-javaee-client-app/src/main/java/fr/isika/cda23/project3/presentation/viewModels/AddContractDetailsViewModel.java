package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

import fr.isika.cda.entities.contract.ContractType;

public class AddContractDetailsViewModel {

	    private Date creationDate;
	    private Date startAt;
	    private Date endAt;
	    private ContractType typeOfContract;
	    
		public Date getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		public Date getStartAt() {
			return startAt;
		}
		public void setStartAt(Date startAt) {
			this.startAt = startAt;
		}
		public Date getEndAt() {
			return endAt;
		}
		public void setEndAt(Date endAt) {
			this.endAt = endAt;
		}
		public ContractType getTypeOfContract() {
			return typeOfContract;
		}
		public void setTypeOfContract(ContractType typeOfContract) {
			this.typeOfContract = typeOfContract;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("AddContractDetailsViewModel [creationDate=");
			builder.append(creationDate);
			builder.append(", startAt=");
			builder.append(startAt);
			builder.append(", endAt=");
			builder.append(endAt);
			builder.append(", typeOfContract=");
			builder.append(typeOfContract);
			builder.append("]");
			return builder.toString();
		}
}
