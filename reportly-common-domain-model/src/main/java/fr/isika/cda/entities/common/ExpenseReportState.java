package fr.isika.cda.entities.common;

public enum ExpenseReportState {

	PAID("Payée"),
	VALIDATED("Validée"),
	PENDING("En Attente"),
	REJECTED("Rejetée");

	private final String label;

	private ExpenseReportState(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
