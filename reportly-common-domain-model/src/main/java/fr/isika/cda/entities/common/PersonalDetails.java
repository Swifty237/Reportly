package fr.isika.cda.entities.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PersonalDetails implements Serializable {
//	L'interface "Serializable" est utilisée pour indiquer
//	que les objets de cette classe peuvent convertis en une représentation pouvant être stockée ou transférée

//	déclaration d'un identifiant unique pour cette version spécifique de la classe lors de la sérialisation.

	/**
	 * 
	 */
	private static final long serialVersionUID = 1058842310211418354L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column
	private String name;
	@Column
	private String firstname;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name = "phone_number")
	private int phoneNumber;

	@Column(name = "job_title")
	private String jobTitle;

	@Temporal(TemporalType.DATE)
	@Column(name = "creation_date")
	private Date creationDate;

	@OneToOne(cascade = CascadeType.ALL)
	private AdressDetails adressDetails;

	public PersonalDetails(String name, String firstname, Date birdhday, int phoneNumber, String jobTitle, Date creationDate) {
		this.name = name;
		this.firstname = firstname;
		this.birthday = birdhday;
		this.phoneNumber = phoneNumber;
		this.jobTitle = jobTitle;
		this.creationDate = creationDate;
	}

	public PersonalDetails() {
	}
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public AdressDetails getAdressDetails() {
		return adressDetails;
	}

	public void setAdressDetails(AdressDetails adressDetails) {
		this.adressDetails = adressDetails;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalDetails [name=");
		builder.append(name);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", birdhday=");
		builder.append(birthday);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", jobTitle=");
		builder.append(jobTitle);
		builder.append(", adressDetails=");
		builder.append(adressDetails);
		builder.append("]");
		return builder.toString();
	}

}
