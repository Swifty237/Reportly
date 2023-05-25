package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.isika.cda.entities.common.AdressDetails;

@Entity
@Table(name = "user_contact")
public class UserContact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6242389040669315536L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String primaryEmail;
	private String secondaryEmail;

	@Embedded
	@AttributeOverride(name = "lineOne", column = @Column(name = "uc_address_lineOne"))
	@AttributeOverride(name = "lineTwe", column = @Column(name = "uc_address_lineTwo"))
	@AttributeOverride(name = "zipCode", column = @Column(name = "uc_address_zipCode"))
	@AttributeOverride(name = "city", column = @Column(name = "uc_address_city"))
	@AttributeOverride(name = "state", column = @Column(name = "uc_address_state"))
	@AttributeOverride(name = "country", column = @Column(name = "uc_address_country")) 
	private AdressDetails address;

	@Embedded
	@AttributeOverride(name = "countryCode", column = @Column(name = "uc_phone_countryCode"))
	@AttributeOverride(name = "phoneNumber", column = @Column(name = "uc_phone_phoneNumber")) 

	public Long getId() {
		return id;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public AdressDetails getAddress() {
		return address;
	}

	public void setAddress(AdressDetails address) {
		this.address = address;
	}
}