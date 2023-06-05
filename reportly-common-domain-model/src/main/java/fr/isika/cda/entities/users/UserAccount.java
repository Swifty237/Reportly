package fr.isika.cda.entities.users;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.esn.Esn;

@Entity
@Table(name = "user_account")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8632944335273962858L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long userId;

	protected String email;

	protected String password;

	@Enumerated(EnumType.STRING)
	protected UserRole userRole;

	@ManyToOne
	public Esn esn;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	protected PersonalDetails pers;

	public Long getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonalDetails getPers() {
		return pers;
	}

	public void setPers(PersonalDetails pers) {
		this.pers = pers;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Esn getEsn() {
		return esn;
	}

	public void setEsn(Esn esn) {
		this.esn = esn;
	}

}
