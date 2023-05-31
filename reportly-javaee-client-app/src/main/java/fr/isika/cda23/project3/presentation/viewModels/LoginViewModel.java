package fr.isika.cda23.project3.presentation.viewModels;

import java.io.Serializable;

public class LoginViewModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2831796088647128403L;
	private String email;
	private String password;

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

	public boolean isValid() {
		return email != null && password != null && !email.isBlank() && !password.isBlank();
	}
}
