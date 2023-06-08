package fr.isika.cda.entities.activity;

public enum TrainingType {

	GIVEN ("Prestation de formation"), 
	RECEIVED ("En formation");
	
	private String label;

	private TrainingType(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
