package fr.isika.cda.entities.activity;

public enum DutyType {

	SERVICE("Prestation externe"), 
	JOB_INTERVIEW ("Entretiens"), 
	INTERCONTRAT ("Inter contrat"), 
	ON_CALL ("Astreinte");

	private String label;

	private DutyType(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}