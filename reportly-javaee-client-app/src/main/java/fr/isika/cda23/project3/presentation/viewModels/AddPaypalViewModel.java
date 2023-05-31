package fr.isika.cda23.project3.presentation.viewModels;

public class AddPaypalViewModel {

	private String EmailPaypal;
	private String PasswordPaypal;
	
	public String getEmailPaypal() {
		return EmailPaypal;
	}
	public void setEmailPaypal(String emailPaypal) {
		EmailPaypal = emailPaypal;
	}
	public String getPasswordPaypal() {
		return PasswordPaypal;
	}
	public void setPasswordPaypal(String passwordPaypal) {
		PasswordPaypal = passwordPaypal;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddPayPalViewModel [EmailPaypal=");
		builder.append(EmailPaypal);
		builder.append(", PasswordPaypal=");
		builder.append(PasswordPaypal);
		builder.append("]");
		return builder.toString();
	}
}
