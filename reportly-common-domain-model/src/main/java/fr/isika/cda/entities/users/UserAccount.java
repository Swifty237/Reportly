package fr.isika.cda.entities.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.isika.cda.entities.common.PersonalDetails;
import fr.isika.cda.entities.esn.ESN;

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

	@ManyToOne
	public ESN esn;
	
	@OneToMany
	private List<Role> roleList=new ArrayList<>();
	
//	@Enumerated(EnumType.STRING)
//	private UserRole primaryRole;

//	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
//	private UserProfile userProfile;
//	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	protected PersonalDetails pers;

	public Long getUserId() {
		return userId;
	}
	
//	public UserProfile getUserProfile() {
//		return userProfile;
//	}
//	public void setUserProfile(UserProfile userProfile) {
//		this.userProfile = userProfile;
//	}
//	public UserRole getPrimaryRole() {
//		return primaryRole;
//	}
//	public void setPrimaryRole(UserRole primaryRole) {
//		this.primaryRole = primaryRole;
//	}

	public UserAccount withEmail(String email) {
		this.email = email;
		return this;
	}

	public UserAccount withPassword(String password) {
		this.password = password;
		return this;
	}

//	public UserAccount withProfile(UserProfile profile) {
//		userProfile = profile;
//		return this;
}

//	public UserAccount withPrimaryRole(UserRole role) {
//		primaryRole = role;
//		return this;
//	}

//	public UserAccount withDefaultPropertiesAndProfile() {
////		this.username = DefaultValues.DEFAULT_USERNAME;
//		this.password = DefaultValues.DEFAULT_PASSWORD;
//		this.userProfile = new UserProfile();
//		return this;
//	}

class DefaultValues {
	public static final String DEFAULT_USERNAME = "user";
	public static final String DEFAULT_PASSWORD = "password";

	private DefaultValues() {
	}
}
