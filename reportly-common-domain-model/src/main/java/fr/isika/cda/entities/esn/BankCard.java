package fr.isika.cda.entities.esn;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BankCard extends Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7870002736397125650L;

	private String ownerName;
	private Integer bankCardNumber;
	private Integer securityNumber;

	@Temporal(TemporalType.DATE)
	private Date dateExpiration;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(Integer bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public Integer getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(Integer securityNumber) {
		this.securityNumber = securityNumber;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	public Long getId() {
		return super.id;
	}
}
