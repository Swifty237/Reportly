package fr.isika.cda23.entities.service;

public enum ErState {

	PAID("payé"), NOT_PAID("non payé");

	private final String label;

	private ErState(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}