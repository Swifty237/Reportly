package fr.isika.cda.entities.esn;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Paypal extends Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5073928922012336232L;
	
	private String emailPaypal;
	private String passwordPaypal;
	
	public String getEmailPaypal() {
		return emailPaypal;
	}
	public void setEmailPaypal(String emailPaypal) {
		this.emailPaypal = emailPaypal;
	}
	public String getPasswordPaypal() {
		return passwordPaypal;
	}
	public void setPasswordPaypal(String passwordPaypal) {
		this.passwordPaypal = passwordPaypal;
	}
}
