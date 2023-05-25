package fr.isika.cda23.entities.users;

public enum UserRole {

	EMPLOYEE ("Salarié"), TEAM_MANAGER("Manager"), ESN_MANAGER("Admin");

	private final String label;

	private UserRole(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}