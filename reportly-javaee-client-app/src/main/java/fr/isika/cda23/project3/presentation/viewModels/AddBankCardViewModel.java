package fr.isika.cda23.project3.presentation.viewModels;

import java.util.Date;

public class AddBankCardViewModel {
	
	private String OwnerName;
	private Integer BankCardNumber;
	private Integer SecurityNumber;
	private Date DateExpiration;
	
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public Integer getBankCardNumber() {
		return BankCardNumber;
	}
	public void setBankCardNumber(Integer bankCardNumber) {
		BankCardNumber = bankCardNumber;
	}
	public Integer getSecurityNumber() {
		return SecurityNumber;
	}
	public void setSecurityNumber(Integer securityNumber) {
		SecurityNumber = securityNumber;
	}
	public Date getDateExpiration() {
		return DateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		DateExpiration = dateExpiration;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddBankCardViewModel [OwnerName=");
		builder.append(OwnerName);
		builder.append(", BankCardNumber=");
		builder.append(BankCardNumber);
		builder.append(", SecurityNumber=");
		builder.append(SecurityNumber);
		builder.append(", DateExpiration=");
		builder.append(DateExpiration);
		builder.append("]");
		return builder.toString();
	}
}
