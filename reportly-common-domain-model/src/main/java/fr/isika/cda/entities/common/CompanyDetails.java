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


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> a6ba52f (register esn ok)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3cd4aa3 (subscription company)
=======
>>>>>>> 84f94f9 (register esn ok)
=======
>>>>>>> d3087e5 (subscription company)
=======
>>>>>>> ab3abe1 (register esn ok)
=======
>>>>>>> aa13acd (subscription company)
=======
>>>>>>> a6ba52f (register esn ok)
=======

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


>>>>>>> c192cbb (Refactoring of many files to fix the bug with the form in registerCustomer.xhtml)
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
