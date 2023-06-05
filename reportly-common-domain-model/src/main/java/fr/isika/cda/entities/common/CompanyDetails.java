package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CompanyDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7519432927046386372L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	private String brand;
	
	private String password;
	
	private String email;
	

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Document document;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private AdressDetails adressDetails;
<<<<<<< HEAD
=======

>>>>>>> uc_customer_register_bis

	public Long getId() {
		return id;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdressDetails getAdressDetails() {
		return adressDetails;
	}

	public void setAdressDetails(AdressDetails adressDetails) {
		this.adressDetails = adressDetails;
	}


	public AdressDetails getAdressDetails() {
		return adressDetails;
	}


	public void setAdressDetails(AdressDetails adressDetails) {
		this.adressDetails = adressDetails;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanyDetails [id=");
		builder.append(id);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", email=");
		builder.append(email);
		builder.append(", document=");
		builder.append(document);
		builder.append("]");
		return builder.toString();
	}

}
